<%@ page language="java" contentType="text/html; charset=UTF-8" import="cn.com.iistudio.entity.Infrom"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="/525station/static/layui/css/layui.css"  media="all">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
       
                 
  <ul class="layui-nav layui-bg-cyan">
    <li class="layui-nav-item"><a href="">IISTUIO</a></li>
    <li class="layui-nav-item" lay-unselect="">
    <a href="javascript:;"><img src="${currentUser.getHeadImage()}" class="layui-nav-img">${currentUser.getNickname()}</a>
    <dl class="layui-nav-child">
      <dd><a href="javascript:;">修改信息</a></dd>
      <dd><a href="javascript:;">安全管理</a></dd>
      <dd><a href="/525station/Administrator/exitMp">退了</a></dd>
    </dl>
  </li>
        <li class="layui-nav-item "><a href="/525station/InvitateInteriormain">进入选择界面</a></li>
  </ul>           
  
  <fieldset class="layui-elem-field layui-field-title" >
    <legend style="width:50%;margin:0 auto;text-align: center;">功能管理</legend>
  </fieldset>
   
  <div class="layui-tab layui-tab-card" style="width:80%;margin:0 auto;height: 36rem;">
    <ul class="layui-tab-title" >
      <li class="layui-this">用户管理</li>
      <li >消息通知</li>
      <li>XXXX</li>
      <li>XXXX</li>
      <li>XXXX</li>
    </ul>
    <div class="layui-tab-content" style="height: 100px;">     
       <div class="layui-tab-item layui-show">


        <div class="layui-col-xs6 layui-col-md12">
          <div class="grid-demo grid-demo-bg2">
            <div class="layui-btn-group demoTable">
                   <button class="layui-btn" data-type="getCheckData">批量删除</button>
                  <button class="layui-btn" data-type="getCheckLength">获取选中数目</button>
            
                </div>
   
                <table class="layui-table" lay-data="{cellMinWidth: 80,height: 'full-332', url:'/525station/json.do', page:true, id:'idTest'}" lay-filter="demo">
                  <thead>
                    <tr>
                      <th lay-data="{type:'checkbox', fixed: 'left'}"></th>
                      <th lay-data="{field:'nickname', width:120}">昵称</th>
                      <th lay-data="{field:'username', width:120}">用户名</th>
                      <th lay-data="{field:'password', width:120}">密码</th>
                      <th lay-data="{field:'gender', width:60}">性别</th>
                      <th lay-data="{field:'email', width:120}">邮件</th>
                      <th lay-data="{field:'tel', width:120}">电话号码</th>
                      <th lay-data="{field:'introduce', width:120}">介绍</th>
                      <th lay-data="{field:'privilege', width:100, sort: true}">权限</th>
                      <th lay-data="{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}"></th>
                    </tr>
                    
                  </thead>
                </table>
                <script type="text/html" id="barDemo">
          <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
          <a class="layui-btn layui-btn-xs"  onclick="WeAdminEdit('编辑','/525station/toturnchange', 1, 600, 400,id)" href="javascript:;">编辑</a>
          <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
              </script>
          </div>
        </div>

  </div>
      <div class="layui-tab-item">
   
            <form:form id="myform" method="post" commandName="notice">

               

                  <div class="layui-form-item">
                      <label class="layui-form-label">title：</label>
                      <div class="layui-input-inline">
                        <form:input type="text" path="title" lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input" />
                      </div>
                    </div>

                    <div class="layui-form-item">
                        <label class="layui-form-label">description：</label>
                        <div class="layui-input-block">
                          <form:input type="text" path="description" autocomplete="off" placeholder="请描述" class="layui-input" />
                        </div>
                      </div>

                  <div class="layui-form-item layui-form-text">
                      <label class="layui-form-label">text：</label>
                      <div class="layui-input-block">
                        <form:textarea placeholder="请输入内容" path="text" class="layui-textarea"></form:textarea>
                      </div>
                    </div>

                   
                        <div class="layui-form-item">
                            <div class="layui-input-block">
                              <button class="layui-btn" id="common-btn" lay-submit="" lay-filter="demo1">发布公共通知</button>
                              <button class="layui-btn layui-btn-normal" id="inner-btn" lay-submit="" lay-filter="demo1">发布内部通知</button>
                              <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                            </div>
                        </div>



            </form:form>
      </div>
      <div class="layui-tab-item">3</div>    
      <div class="layui-tab-item">4</div>
      <div class="layui-tab-item">5</div>
      <div class="layui-tab-item">6</div>
    </div>
  </div>
  </div>
     



     
  


    
<script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="/525station/static/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->


<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
      var form = layui.form
      ,layer = layui.layer
      ,layedit = layui.layedit
      ,laydate = layui.laydate;
      
      //日期
      laydate.render({
        elem: '#date'
      });
      laydate.render({
        elem: '#date1'
      });
      
      //创建一个编辑器
      var editIndex = layedit.build('LAY_demo_editor');
     
      //自定义验证规则
      form.verify({
        title: function(value){
          if(value.length < 5){
            return '标题至少得5个字符啊';
          }
        }
        
        
      });
      
      //监听指定开关
      form.on('switch(switchTest)', function(data){
        layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
          offset: '6px'
        });
        layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
      });
      
      //监听提交
      form.on('submit(demo1)', function(data){
        layer.alert(JSON.stringify(data.field), {
          title: '最终的提交信息'
        })
        return false;
      });
     
      /*弹出层+传递ID参数*/
      window.WeAdminEdit = function(title, url, id, w, h,idone) {
    	  alert(idone);
    	  alert(idone.username);
          if(title == null || title == '') {
              title = false;
          };
          if(url == null || url == '') {
              url = "404.html";
          };
          if(w == null || w == '') {
              w = ($(window).width() * 0.9);
          };
          if(h == null || h == '') {
              h = ($(window).height() - 50);
          };
          layer.open({
              type: 2,
              area: [w + 'px', h + 'px'],
              fix: false, //不固定
              maxmin: true,
              shadeClose: true,
              shade: 0.4,
              title: title,
              content: url,
              success: function(layero, index) {
                  //向iframe页的id=house的元素传值  // 参考 https://yq.aliyun.com/ziliao/133150
                  var body = layer.getChildFrame('body', index);
                  body.contents().find("#dataId").val(id);
                  console.log(id);
              },
              error: function(layero, index) {
                  alert("aaa");
              }
          });
      }
      
    });
    
    </script>
<script src="/525station/static/js/managepage.js"></script>

</body>
</html>