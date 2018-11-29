

$(document).ready(function(){
	
	$("#common-btn").click(function(){
		$("#myform").attr({
			action:"/525station/Administrator/releaseInform?scope=all"
		});
		
		$("#myform")[0].submit();
		
	});
	
	$("#inner-btn").click(function(){
		$("#myform").attr({
			action:"/525station/Administrator/releaseInform?scope=inside"
		});
	});
	
	
});
        


layui.use('element', function(){
    var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
    
    //监听导航点击
    element.on('nav(demo)', function(elem){
      //console.log(elem)
      layer.msg(elem.text());
    });
  });

layui.use('element', function(){
  var $ = layui.jquery
  ,element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块
  
  //触发事件
  var active = {
    tabAdd: function(){
      //新增一个Tab项
      element.tabAdd('demo', {
        title: '新选项'+ (Math.random()*1000|0) //用于演示
        ,content: '内容'+ (Math.random()*1000|0)
        ,id: new Date().getTime() //实际使用一般是规定好的id，这里以时间戳模拟下
      })
    }
    ,tabDelete: function(othis){
      //删除指定Tab项
      element.tabDelete('demo', '44'); //删除：“商品管理”
      
      
      othis.addClass('layui-btn-disabled');
    }
    ,tabChange: function(){
      //切换到指定Tab项
      element.tabChange('demo', '22'); //切换到：用户管理
    }
  };
  
  $('.site-demo-active').on('click', function(){
    var othis = $(this), type = othis.data('type');
    active[type] ? active[type].call(this, othis) : '';
  });
  
});
/*数据表格*/
layui.use('element', function(){
  var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块

  //监听导航点击
  element.on('nav(demo)', function(elem){
    //console.log(elem)
    layer.msg(elem.text());
  });
});

layui.use('table', function(){
  var table = layui.table;
  //监听表格复选框选择
  table.on('checkbox(demo)', function(obj){
    console.log(obj)
  });
  //监听工具条
  table.on('tool(demo)', function(obj){
    var data = obj.data;
    if(obj.event === 'detail'){
      layer.msg('ID：'+ data.id + ' 的查看操作');
    } else if(obj.event === 'del'){
      layer.confirm('真的删除行么', function(index){
    	  console.log(obj);        	 
    	  console.log(data);        			
    	  //layer.close(index);         			
    	  $.ajax({                		
    		  url: "/525station/Administrator/delete",                		
    		  type: "POST",                		
    		  data:{'username':data.username},                		
    		  dataType: "json",               			
    		  success: function(data){                                		
    			  if(data==null){                     			
    				  layer.msg("删除失败", {icon: 5});                                            		
    				  }else{                                             		
    					  //删除这一行                        		
    					  obj.del();                       			
    					  //关闭弹框                        		
    					  layer.close(index);                        		
    					  layer.msg("删除成功", {icon: 6});                        		  
    					  layer.closeAll();			                   
    					  parent.location.reload();                        		
    					  Load(); //删除完需要加载数据                   			 
    					  }                		
    			  },                		
    			  error:function(){                			
    				  alert(data);                		
    				  },
    	  });
        layer.close(index);
      });
    } else if(obj.event === 'edit'){
      layer.alert('编辑行：<br>'+ JSON.stringify(data))
    }
  });

  var $ = layui.$, active = {
    getCheckData: function(){ //获取选中数据
      var checkStatus = table.checkStatus('idTest')
      ,data = checkStatus.data;
      layer.alert(JSON.stringify(data));
      var usernames = [];
      for(var i=0;i<data.length;i++){
    	  var one={
    		username:data.username,
    	  }
    	  usernames.push(one);
      }
      
      $.ajax({				
    	  type:"post",				
    	  url:"/525station/Administrator/deleteSelected",				
    	  data : JSON.stringify(usernames),                                
    	  dataType:"json",				
    	  contentType:"application/json",                                
    	  async:false,				
    	  success:function(data){ 					
    		  if(data.code == 200){						
    			  layer.msg('发布成功！', {		  					}, function(){
    				  //跳转的URL重定向到新的页面，这里是直接跳转到个人中心		  					
    				  alert("删除完成");		  					
    				  }); 					
    			  }					
    		  else{					        
    			  layer.alert("res"+result);						
    			  layer.msg(data.message);					
    			  }				
    		  }			
         });  
    }
    ,getCheckLength: function(){ //获取选中数目
      var checkStatus = table.checkStatus('idTest')
      ,data = checkStatus.data;
      layer.msg('选中了：'+ data.length + ' 个');
    }
    ,isAll: function(){ //验证是否全选
      var checkStatus = table.checkStatus('idTest');
      layer.msg(checkStatus.isAll ? '全选': '未全选')
    }
  };

  $('.demoTable .layui-btn').on('click', function(){
    var type = $(this).data('type');
    active[type] ? active[type].call(this) : '';
  });
});

      
