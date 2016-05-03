package com.action.ajax;

import java.util.List;
import com.model.Section;
import com.model.User;
import com.service.impl.SectionService;
import com.service.impl.UserService;

public class UserAjax extends BaseAjax {
	private UserService userService;
	User user;
	String user_name="",user_pwd="";
	int user_id=0,user_role=0,user_depart=0,user_sex=0;
	private String[] createResult = {"创建用户成功","创建用户失败","用户信息不完整"};	
	private String[] updateResult = {"修改用户成功","修改用户失败","用户ID错误"};	
	private String[] deleteResult = {"删除用户成功","创建用户失败","用户ID错误"};	


	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	
	public void init(){
		user_name = user_pwd = "";
		user_id = user_role = user_depart = user_sex = -1;
	}
	
	public String list(){
		data = initMap();
		List<User> list  = userService.findAll();
		for (User user : list) {
			if(user.getSection()!=null){
				user.setSectionName(user.getSection().getName());
				user.setSection(null);
			}
		}
		data.put("status", 0);
		data.put("total", list.size());
		data.put("data", list );
		
		return SUCCESS;
	}
	
	public String create() {
		System.out.println("insert user : "+user_name);
		int res = 0;
		if(user_name.equals("")||user_pwd.equals(""))
			res = 2;
		else{
			User tmp = new User();
			tmp.setName(user_name);
			tmp.setSex(user_sex);
			tmp.setPwd(user_pwd);
			tmp.setStatus(0);
			tmp.setSection(new Section(user_depart));
			res = userService.create(tmp);
		}
		data = initMap();
		data.put("status", res);
		data.put("msg", createResult[res]);
		init();
		return SUCCESS;
	}
	
	
	public String update() {
		int res = 0;
		if(user_id<=0 || user_name.equals("")|| user_pwd.equals(""))
			res = 2;
		else{
			User user = new User();
			user.setId(user_id);
			user.setName(user_name);
			user.setPwd(user_pwd);
			user.setSex(user_sex);
			user.setStatus(0);

			res = userService.update(user);
		}
		data = initMap();
		data.put("status", res);
		data.put("msg", updateResult[res]);
		init();
		return SUCCESS;
	}
	
	public String remove() {
		int res = 0;
		if(user_id <= 0 )
			res = 2;
		else{
			res = userService.delete(user_id);
		}
		data = initMap();
		data.put("status", res);
		data.put("msg", deleteResult[res]);
		init();

		return SUCCESS;
	}


	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public User getUser() {
		return user;
	}


	


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getUser_pwd() {
		return user_pwd;
	}


	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public int getUser_role() {
		return user_role;
	}


	public void setUser_role(int user_role) {
		this.user_role = user_role;
	}


	public int getUser_depart() {
		return user_depart;
	}


	public void setUser_depart(int user_depart) {
		this.user_depart = user_depart;
	}


	public int getUser_sex() {
		return user_sex;
	}


	public void setUser_sex(int user_sex) {
		this.user_sex = user_sex;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser(User user) {
		this.user = user;
	}
	



}
