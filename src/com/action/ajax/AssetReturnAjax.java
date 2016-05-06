package com.action.ajax;

import java.sql.Timestamp;
import java.util.List;

import com.model.Asset;
import com.model.AssetReturn;
import com.model.Section;
import com.model.User;
import com.service.impl.AssetReturnService;
import com.service.impl.UserService;
import com.service.impl.AssetService;

public class AssetReturnAjax extends BaseAjax {
	public AssetReturnService returnService;
	public UserService userService;
	public AssetService assetService;
	public String gettime="",returntime="",asset_name="",user_name="";
	public int id,assetid,status,recipientid,returnerid;
	public User recipient,returner;
	public Asset asset;
	
	private String[] createResult = {"领用成功","归还信息错误","系统错误,归还失败"};		
	private String[] updateResult = {"归还成功","归还信息错误","系统错误,归还失败"};		
	private String[] deleteResult = {"删除系统参数成功","参数ID错误","系统错误，删除失败"};	
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	public void init(){
		gettime=returntime=asset_name=user_name="";
		id=assetid=status=recipientid=returnerid=0;
	}
	
	public String list(){
		data = initMap();
		List<AssetReturn> list=returnService.findAll();
		for (AssetReturn assetReturn : list) {
			assetReturn.setAsset(null);
		}
		data.put("status", 0);
		data.put("data", list);
		return SUCCESS;
	}

	public String search_asset(){
		data = initMap();
		List<Asset> list=assetService.getLikeName(asset_name);
		data.put("status", 0);
		data.put("data", list);
		return SUCCESS;
	}
	
	public String search_user(){
		System.out.println("归还: "+user_name);
		data = initMap();
		List<User> list=userService.getLikeName(user_name);
		data.put("status", 0);
		data.put("data", list);
		return SUCCESS;
	}
	
	public String create() {
		//System.out.println("insert assetreturn : "+asset_name);
		int res = 0;
		recipient=userService.get(recipientid);
		asset=assetService.get(assetid);
		AssetReturn tmp = new AssetReturn();
		tmp.setAsset(asset);
		tmp.setRecipient(recipient);
		tmp.setGettime(new Timestamp(System.currentTimeMillis()));
		tmp.setStatus(1);
		res = returnService.create(tmp);
		data = initMap();
		data.put("status", res);
		data.put("msg", createResult[res]);
		return SUCCESS;
	}
	
	public String update() {
		int res = 0;
		System.out.println(id );
		if(id<=0)
			res = 2;
		else{
			AssetReturn tmp = new AssetReturn();
			returner=userService.get(returnerid);
			asset=assetService.get(assetid);
			tmp.setId(id);
			tmp.setAsset(asset);
			tmp.setReturner(returner);
			tmp.setReturntime(new Timestamp(System.currentTimeMillis()));
			tmp.setStatus(0);
			res = returnService.update(tmp);
		}
		data = initMap();
		data.put("status", res);
		data.put("msg", updateResult[res]);
		return SUCCESS;
	}

	public AssetReturnService getReturnService() {
		return returnService;
	}

	public void setReturnService(AssetReturnService returnService) {
		this.returnService = returnService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public AssetService getAssetService() {
		return assetService;
	}

	public void setAssetService(AssetService assetService) {
		this.assetService = assetService;
	}

	public String getGettime() {
		return gettime;
	}

	public void setGettime(String gettime) {
		this.gettime = gettime;
	}

	public String getReturntime() {
		return returntime;
	}

	public void setReturntime(String returntime) {
		this.returntime = returntime;
	}

	public String getAsset_name() {
		return asset_name;
	}

	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAssetid() {
		return assetid;
	}

	public void setAssetid(int assetid) {
		this.assetid = assetid;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getRecipientid() {
		return recipientid;
	}

	public void setRecipientid(int recipientid) {
		this.recipientid = recipientid;
	}

	public int getReturnerid() {
		return returnerid;
	}

	public void setReturnerid(int returnerid) {
		this.returnerid = returnerid;
	}

	public User getRecipient() {
		return recipient;
	}

	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}

	public User getReturner() {
		return returner;
	}

	public void setReturner(User returner) {
		this.returner = returner;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	
}
