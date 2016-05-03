//显示Table
var $table = $('#user_table');
    $table.bootstrapTable({
    url: '../ajaxuser_list', 
    dataType: 'json',
    method:'get',
    pagination: true,
    pageSize:15,
    singleSelect: false,
    columns: [
              {
                  title: '#',
	              field: 'id',
	              align: 'center',
	              width: '20px',
	              valign: 'middle',
	              formatter:function(value,row,index){
	              	 return index+1;
	              }
              },
              {
            	  title: 'ID',
                  field: 'id',
                  align: 'center',
                  valign: 'middle'
              }, 
              {
                  title: '用户名',
                  field: 'name',
                  align: 'center',
                  valign: 'middle',
              }, 
              {
                  title: '性别',
                  field: 'sex',
                  align: 'center',
                  valign: 'middle',
                  formatter:function(value,row,index){
                	  if(value == 0)
                		  return "女";
                	  return "男";
                  }
              }, 
              {
                  title: '角色名',
                  field: 'role',
                  align: 'center',
                  valign: 'middle',
              }, 
              {
                  title: '所属部门',
                  field: 'sectionName',
                  align: 'center',
                  valign: 'middle',
              }, 
              {
                  title: '操作',
                  field: 'id',
                  align: 'center',
                  formatter:function(value,row,index){  
                	  var e = '<a href="#" mce_href="#" onclick="edit(\''+ row.id + '\')">编辑</a> ';  
                	  var d = '<a href="#" mce_href="#" onclick="ajax_delete_user(\''+ row.id +'\')">删除</a> ';  
                    return e+d;  
                  } 
              }
          ]
      });
    
    
function open_useradd_dialog(){
	$('#user-add-modal').modal('show');
	var depart_select = $('#form_add_user select[name="user_depart_text"]');
	var aj = $.ajax({  
	    url:'../ajaxsection_list',// 跳转到 action   
	    type:'post',  
	    cache:false,  
	    dataType:'json',  
	    success:function(data) {  
	        var selectInfo = "";
	        if(data.status =="0" ){  
	        	$.each(data.data,function(i,n){
	        		selectInfo +="<option value='"+n.id+"'>"+n.name+"</option>";
	        	});
	        	depart_select.empty();
	        	depart_select.append(selectInfo);
	        	depart_select.selectpicker('render');
	        	depart_select.selectpicker('refresh');
	        }
	     },  
	     error : function() {  
	    	alert("异常！");  
	     }  
	});
	
}    
        
//添加
function ajax_user_add(){
	$name   = $('#form_add_user input[name="user_name_text"]').val();
	$sex    = $('#form_add_user input[name="user_sex_text"]:checked').val();
	$depart = $('#form_add_user select[name="user_depart_text"]').selectpicker('val');
	$pwd    = $('#form_add_user input[name="user_pwd_text"]').val();

	var aj = $.ajax({  
	    url:'../ajaxuser_create',// 跳转到 action  
	    data:{  
	    	user_name : $name,
	    	user_pwd  : $pwd,
	    	user_depart : $depart,
	    	user_sex  : $sex,
	    },  
	    type:'post',  
	    cache:false,  
	    dataType:'json',  
	    success:function(data) {  
	        alert(data.msg);  
	        if(data.status =="0" ){  
	             $('#user-add-modal').modal('hide');
	             $('#user_table').bootstrapTable('refresh');
	        }
	     },  
	     error : function() {  
	    	alert("异常！");  
	     }  
	});
}

//删除
function ajax_delete_user(id){
	
	BootstrapDialog.show({
        title: '确认删除用户信息',
        message: '用户将被永久删除，是否确定操作。',
        buttons: [{
            label: '确认',
            action: function(dialog) {
                dialog.close();
                var aj = $.ajax({  
	        	    url:'../ajaxuser_remove',// 跳转到 action  
	        	    data:{  
	        	    	user_id : id,
	        	    },  
	        	    type:'post',  
	        	    cache:false,  
	        	    dataType:'json',  
	        	    success:function(data) {  
	        	        alert(data.msg);  
	        	        if(data.status =="0" ){  
	        	             $table.bootstrapTable('refresh');
	        	        }
	        	     },  
	        	     error : function() {  
	        	    	alert("异常！");  
	        	     }  
	        	});
            }
        }, {
            label: '取消',
            action: function(dialog) {
                dialog.close();
            }
        }]
    });
}
        
        
        
