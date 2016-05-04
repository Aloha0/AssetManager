	var $table = $('#purchase_table');

	$table.bootstrapTable({
	    url: '../ajaxpurchase_list', 
	    dataType: 'json',
	    method:'get',
	    pagination: true,
	    pageSize:15,
	    singleSelect: false,
	    search: true,
	  //  sidePagination: "server", //服务端处理分页
	          columns: [
	                  {
	                    title: 'ID',
	                      field: 'id',
	                      align: 'center',
	                      valign: 'middle'
	                  }, 
	                  {
	                      title: '资产名称',
	                      field: 'detail.name',
	                      align: 'center',
	                      valign: 'middle',
	                  }, 
	                  {
	                      title: '资产类型',
	                      field: '',
	                      align: 'center',
	                      valign: 'middle',
	                  }, 
	                  {
	                      title: '生产商',
	                      field: 'detail.maker',
	                      align: 'center',
	                      valign: 'middle',
	
	                  }, 
	                  {
	                      title: '供货商',
	                      field: 'detail.supply',
	                      align: 'center',
	                      valign: 'middle',
	
	                  }, 
	                  {
	                      title: '数量',
	                      field: 'detail.num',
	                      align: 'center',
	                      valign: 'middle',
	                      formatter:function(value,row,index){  
	                    	  return row.detail.num + "  "+row.detail.unit;
	                      } 
	                  }, 
	                  {
	                      title: '价格',
	                      field: 'detail.price',
	                      align: 'center',
	                      valign: 'middle',
	                      formatter:function(value,row,index){  
	                    	  return "￥ "+value;
	                      } 
	                  }, 
	                  {
	                      title: '财务入账',
	                      field: 'status',
	                      align: 'center',
	                      valign: 'middle',
	                      formatter:function(value,row,index){ 
	                    	  if(value == 0)
	                    		  return "未入账";
	                    	  else
	                    		  return "已入账";
	                      } 
	                  }, 
	                  {
	                      title: '操作',
	                      field: 'id',
	                      align: 'center',
	                      formatter:function(value,row,index){
	                    	  var a = '<a href="#" mce_href="#" onclick="ajax_finance_open(\''+ row.id +'\')">财务入账</a> ';
	                    	  var s = '<a href="#" mce_href="#" onclick="purchase_show('+value+')">查看</a> ';  
	                    	  var d = '<a href="#" mce_href="#" onclick="ajax_setting_delete(\''+ row.id +'\')">删除</a> ';  
	                          return a+s+d;  
	                      } 
	                  }
	              ]
	      });

	//查看
	function purchase_show(id){
		data = $table.bootstrapTable('getRowByUniqueId', id);
    	$('#form_show_purchase input[name="purchase_name_text"]').val(data.detail.name);
    	$('#form_show_purchase input[name="purchase_purpose_text"]').val(data.purpose);
    	$('#form_show_purchase input[name="asset_type_text"]').val('');
    	$('#form_show_purchase input[name="purchase_unit_text"]').val(data.detail.unit);
    	$('#form_show_purchase input[name="purchase_num_text"]').val(data.detail.num);
    	$('#form_show_purchase input[name="purchase_remark_text"]').val(data.detail.remark);
    	$('#form_show_purchase input[name="purchase_model_text"]').val(data.detail.type);
    	$('#form_show_purchase input[name="purchase_maker_text"]').val(data.detail.maker);
    	$('#form_show_purchase input[name="purchase_supply_text"]').val(data.detail.supply);
    	$('#form_show_purchase input[name="purchase_price_text"]').val(data.detail.price);
		
		$('#purchase-show-modal').modal("show");

	}
	
	
    //添加
    function ajax_purchase_add(){
    	$name   = $('#form_add_purchase input[name="purchase_name_text"]').val();
    	$purpose= $('#form_add_purchase input[name="purchase_purpose_text"]').val();
    	$typeid = $('#form_add_purchase input[name="asset_type_text"]').val();
    	$unit   = $('#form_add_purchase input[name="purchase_unit_text"]').val();
    	$num    = $('#form_add_purchase input[name="purchase_num_text"]').val();
    	$remark = $('#form_add_purchase input[name="purchase_remark_text"]').text();
    	$model  = $('#form_add_purchase input[name="purchase_model_text"]').val();
    	$maker  = $('#form_add_purchase input[name="purchase_maker_text"]').val();
    	$supply = $('#form_add_purchase input[name="purchase_supply_text"]').val();
    	$price  = $('#form_add_purchase input[name="purchase_price_text"]').val();

    	var aj = $.ajax({  
    	    url:'../ajaxpurchase_create',// 跳转到 action  
    	    data:{  
    	    	purpose : $purpose,
    	    	asset_name  : $name,
    	    	asset_model : $model,
    	    	unit : $unit,
    	    	maker : $maker,
    	    	supply : $supply,
    	    	remark : $remark,
    	    	num : $num,
    	    	asset_type_id : $typeid,
    	    	price : $price,
    	    },  
    	    type:'post',  
    	    cache:false,  
    	    dataType:'json',  
    	    success:function(data) {  
    	        alert(data.msg);  
    	        if(data.status =="0" ){  
    	             $('#purchase-add-modal').modal('hide');
    	             $('#purchase_table').bootstrapTable('refresh');
    	        }
    	     },  
    	     error : function() {  
    	    	alert("异常！");  
    	     }  
    	});
    }

    
    //删除
    function ajax_setting_delete(id){
    	
    	BootstrapDialog.show({
            title: '确认删除参数',
            message: '参数信息将被永久删除',
            buttons: [{
                label: '确认',
                action: function(dialog) {
                    dialog.close();
                    alert("还未实现");
                    /*
                    var aj = $.ajax({  
    	        	    url:'../ajaxsetting_remove',// 跳转到 action  
    	        	    data:{  
    	        	    	setting_id : id,
    	        	    },  
    	        	    type:'post',  
    	        	    cache:false,  
    	        	    dataType:'json',  
    	        	    success:function(data) {  
    	        	        alert(data.msg);  
    	        	        if(data.status =="0" ){  
    	        	             $('#setting_table').bootstrapTable('refresh');
    	        	        }
    	        	     },  
    	        	     error : function() {  
    	        	    	alert("异常！");  
    	        	     }  
    	        	});*/
                }
            }, {
                label: '取消',
                action: function(dialog) {
                    dialog.close();
                }
            }]
        });
    }

    //打开财务入账对话框
    function ajax_finance_open(id){
    	data = $table.bootstrapTable('getRowByUniqueId', id);
    	$('#form_add_finance input[name="purchase_name_text"]').val(data.detail.name);
    	$('#form_add_finance input[name="purchase_purpose_text"]').val(data.purpose);
    	$('#form_add_finance input[name="asset_type_text"]').val('');
    	$('#form_add_finance input[name="purchase_unit_text"]').val(data.detail.unit);
    	$('#form_add_finance input[name="purchase_num_text"]').val(data.detail.num);
    	$('#form_add_finance input[name="purchase_remark_text"]').val(data.detail.remark);
    	$('#form_add_finance input[name="purchase_model_text"]').val(data.detail.type);
    	$('#form_add_finance input[name="purchase_maker_text"]').val(data.detail.maker);
    	$('#form_add_finance input[name="purchase_supply_text"]').val(data.detail.supply);
    	$('#form_add_finance input[name="purchase_price_text"]').val(data.detail.price);
    	$('#form_add_finance input[name="finance_id_text"]').val(id);
    	$('#finance-add-modal').modal("show");
    }
    
//财务入账
function ajax_finance_add(){
	$id = $('#form_add_finance input[name="finance_id_text"]').val();
	alert("删除："+ $id);
	
	/*
    var aj = $.ajax({  
	    url:'../ajaxfinance_add',// 跳转到 action  
	    data:{  
	    	setting_id : id,
	    },  
	    type:'post',  
	    cache:false,  
	    dataType:'json',  
	    success:function(data) {  
	        alert(data.msg);  
	        if(data.status =="0" ){  
	             $('#setting_table').bootstrapTable('refresh');
	        }
	     },  
	     error : function() {  
	    	alert("异常！");  
	     }  
	});
	*/
	
}

