<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <title>layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="/525station/static/layui/css/layui.css" media="all">
  <link rel="stylesheet" href="/525station/static/css/interiormain.css">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>

<body>
  <div class="layui-layout  layui-layout-admin">

    <div class="layui-header header header-demo" winter>
      <div class="layui-main">
        <a class="logo" href="/">
          <img src="/525station/static/LOGO/logo.png" alt="layui">
        </a>

        <ul class="layui-nav ii-nav">
          <li class="layui-nav-item">
            <a href="">个人中心<span class="layui-badge-dot"></span></a>
          </li>
          <li class="layui-nav-item" lay-unselect="">
            <a href="javascript:;"><img src="${currentUser.headImage}" class="layui-nav-img">${currentUser.getNickname()}</a>
            <dl class="layui-nav-child">
              <dd><a href="javascript:;">修改信息</a></dd>
              <dd><a href="javascript:;">出口</a></dd>
            </dl>
          </li>
        </ul>
      </div>
    </div>
    <!--内容-->

    <div class="layui-row main-row">



      <div class="layui-col-xs6 layui-col-md12">

        <div class="grid-demo grid-demo-bg2">

          <div class="layui-carousel" id="carouselMain">
            <div carousel-item="">
              <div><img src="525station/static/images/e0552a97b5206c64e1ef6e4ab2a6ba26.jpg"></div>
              <div><img src="//res.layui.com/images/layui/demo/2.png"></div>
              <div><img src="//res.layui.com/images/layui/demo/3.png"></div>
              <div><img src="//res.layui.com/images/layui/demo/4.png"></div>
              <div><img src="//res.layui.com/images/layui/demo/5.png"></div>
              <div><img src="//res.layui.com/images/layui/demo/6.png"></div>
              <div><img src="//res.layui.com/images/layui/demo/7.png"></div>
            </div>
          </div>

        </div>
      </div>

      <div class="layui-col-xs6 layui-col-md12">
        <div class="grid-demo grid-demo-bg2">
          <div class="item">
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
              <legend><i class="layui-icon layui-icon-website"> 工作室动态</i></legend>
            </fieldset>


            <div class="layui-row layui-col-space5">
            
             <c:forEach items="${studioNewsList}" var="item">
			              <div class="layui-col-md4">
			                <div class="grid-demo grid-demo-bg1">
			                  <div class="layui-card">
			                  <div class="layui-card-header"><a href="#">${item.getTitle()}</a></div>
			                  <div class="layui-card-body Sdy-contant">
			                  <Sdycontant>
			                    ${item.getDescription()}
			                </Sdycontant>
			                    <Sdyimage>
			                 <img src="/525station/static/images/Kona.jpg" alt="">
			                    </Sdyimage>
			                  </div>
			                  </div>
			
			                </div>
			              </div>
              </c:forEach>
              


 

            </div>
          </div>
        </div>
      </div>


      <div class="layui-col-xs6 layui-col-md12 ">
        <div class="grid-demo grid-demo-bg2">
          <div class="item">
          <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
            <legend><i class="layui-icon layui-icon-notice"> 工作室通知</i></legend>
          </fieldset>


          <div class="layui-row layui-col-space10">
          
          
          
          
          
          <c:forEach  items="${information}" var="item">
            <div class="layui-col-md2 ">
              <div class="grid-demo grid-demo-bg1 inform-co">

                <div class="important-inform inform">


                  <div class="layui-col-md12">
                  
                    <div class="layui-card">
                      <div class="layui-card-body">
                        <i class="layui-icon layui-icon-fire"></i>
                        <datatime>${item.getPubdata() }</datatime>
                      </div>

                        <div class="layui-card-body"><a href="#">${item.getTitle()}  </a></div>

                       <div class="layui-card-body">
                        ${item.getText() }
                      </div>
                    </div>
                  </div>

                </div>

              </div>
            </div>

      </c:forEach>







  




           

              
              
              
              <div class="layui-col-md4">
                <div class="grid-demo dy-co inform-co">
                  <div class="layui-tab">
                    <ul class="layui-tab-title">
                      <li class="layui-this">时间</li>

                      <li>权限分配</li>
                    </ul>
                    <div class="layui-tab-content">
                      <div class="layui-tab-item layui-show">
                      <c:forEach items="${informations}" var="item">
                           <inform>
                               <informtime>${item.getPubdata()}</informtime>
                               <informtitle><a href="#">${item.getTitle()}</a></informtitle>
                               <informauthor>${item.getUsername()}</informauthor>
                           </inform>
                       </c:forEach> 
                            <div id="dopage"></div>

                      </div>
                      <div class="layui-tab-item">内容2</div>

                    </div>
                  </div>

                  </ul>
                </div>
              </div>
            </div>





          </div>
        </div>
      </div>

      <div class="layui-col-xs6 layui-col-md12">
        <div class="grid-demo grid-demo-bg2">
          <div class="item">
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
              <legend><i class="layui-icon layui-icon-share"> 资源分享</i></legend>
            </fieldset>


            <div class="layui-row layui-col-space10">
              <div class="layui-col-md12">
                <div class="grid-demo grid-demo-bg1 resources">
                  <div class="layui-tab">
                    <ul class="layui-tab-title">
                      <li class="layui-this">人工智能</li>
                      <li>前端</li>
                      <li>后台</li>
                      <li>大数据</li>
                      <li>简约时间线：大事记</li>
                    </ul>
                    <div class="layui-tab-content">
                      <div class="layui-tab-item layui-show">
                        <resource>
                        
                          
                          <a href="#">
                            <item>
                              <i class="layui-icon layui-icon-file-b"></i>11111
                             <resourcesketch>2222</resourcesketch>
                             <resourcetime>555</resourcetime>
                              <resourceauthor>6666</resourceauthor>
                            </item>
                          </a>
                       
                        </resource>
                      </div>
                      <div class="layui-tab-item">
                        <resource>
                          <a href="#">
                            <item>什么是人工智能？</item>
                          </a>
                          <a href="#">
                            <item>什么是人工智能？</item>
                          </a>
                          <a href="#">
                            <item>什么是人工智能？</item>
                          </a>
                          <a href="#">
                            <item>什么是人工智能？</item>
                          </a>
                          <a href="#">
                            <item>什么是人工智能？</item>
                          </a>
                          <a href="#">
                            <item>什么是人工智能？</item>
                          </a>
                          <a href="#">
                            <item>更多......</item>
                          </a>
                        </resource>
                      </div>
                      <div class="layui-tab-item">内容3</div>
                      <div class="layui-tab-item">内容4</div>
                      <div class="layui-tab-item">

                        <ul class="layui-timeline">
                          <li class="layui-timeline-item">
                            <i class="layui-icon layui-timeline-axis"></i>
                            <div class="layui-timeline-content layui-text">
                              <div class="layui-timeline-title"><a href="#">2018年，layui 5.0 发布。并发展成为中国最受欢迎的前端UI框架（期望</a></div>
                            </div>
                          </li>
                          <li class="layui-timeline-item">
                            <i class="layui-icon layui-timeline-axis"></i>
                            <div class="layui-timeline-content layui-text">
                              <div class="layui-timeline-title"><a href="#">2017年，layui 里程碑版本 2.0 发布</a></div>
                            </div>
                          </li>
                          <li class="layui-timeline-item">
                            <i class="layui-icon layui-timeline-axis"></i>
                            <div class="layui-timeline-content layui-text">
                              <div class="layui-timeline-title"><a href="#">2016年，layui 首个版本发布</a></div>
                            </div>
                          </li>
                          <li class="layui-timeline-item">
                            <i class="layui-icon layui-timeline-axis"></i>
                            <div class="layui-timeline-content layui-text">
                              <div class="layui-timeline-title"><a href="#">2015年，layui 孵化</a></div>
                            </div>
                          </li>
                          <li class="layui-timeline-item">
                            <i class="layui-icon layui-timeline-axis"></i>
                            <div class="layui-timeline-content layui-text">
                              <div class="layui-timeline-title"><a href="#">2014年，layui 孵化</a></div>
                            </div>
                          </li>

                          <li class="layui-timeline-item">
                            <i class="layui-icon layui-anim layui-anim-rotate layui-anim-loop layui-timeline-axis"></i>
                            <div class="layui-timeline-content layui-text">
                              <div class="layui-timeline-title"><a href="#">更久前，轮子时代。维护几个独立组件：layer等</a></div>
                            </div>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </div>

                </div>
              </div>

            </div>
          </div>


        </div>
      </div>





       <div class="layui-footer footer footer-demo">
        <div class="layui-main">
          11111111111111111111
        </div>
      </div>

     </div>
    <!--垂直导航-->
    <div class="layui-side a-nav layui-bg-black">
      <div class="layui-side-scroll">

        <ul class="layui-nav layui-nav-tree site-demo-nav">

          <li class="layui-nav-item layui-nav-itemed">
            <a class="javascript:;" href="javascript:;">工作室通知</a>
            <dl class="layui-nav-child">
              <dd>
                <a href="/demo/">近3天</a>
              </dd>
            </dl>
            <dl class="layui-nav-child">
              <dd>
                <a href="/demo/">所有</a>
              </dd>
            </dl>
          </li>

          <li class="layui-nav-item layui-nav-itemed">
            <a class="javascript:;" href="javascript:;">新闻</a>
            <dl class="layui-nav-child">
              <dd class="">
                <a href="/demo/grid.html">近三天</a>
              </dd>
              <dd class="">
                <a href="/demo/admin.html">所有</a>
              </dd>
            </dl>
          </li>

          <li class="layui-nav-item layui-nav-itemed">
            <a class="javascript:;" href="javascript:;">资源</a>
            <dl class="layui-nav-child">
              <dd class="">
                <a class="javascript:;" href="javascript:;">近三天</a>
                <dl class="layui-nav-child">
                  <dd class="">
                    <a href="/demo/grid.html">文章</a>
                  </dd>
                  <dd class="">
                    <a href="/demo/admin.html">视频</a>
                  </dd>
                  <dd class="">
                    <a href="/demo/admin.html">物资</a>
                  </dd>
                </dl>
              </dd>
              <dd class="">
                <a class="javascript:;" href="javascript:;">人工智能</a>
                <dl class="layui-nav-child">
                  <dd class="">
                    <a href="/demo/grid.html">文章</a>
                  </dd>
                  <dd class="">
                    <a href="/demo/admin.html">视频</a>
                  </dd>
                  <dd class="">
                    <a href="/demo/admin.html">物资</a>
                  </dd>
                </dl>
              </dd>
              <dd class="">
                <a class="javascript:;" href="javascript:;">后端</a>
                <dl class="layui-nav-child">
                  <dd class="">
                    <a href="/demo/grid.html">文章</a>
                  </dd>
                  <dd class="">
                    <a href="/demo/admin.html">视频</a>
                  </dd>
                  <dd class="">
                    <a href="/demo/admin.html">物资</a>
                  </dd>
                </dl>
              </dd>
              <dd class="">
                <a class="javascript:;" href="javascript:;">前端</a>
                <dl class="layui-nav-child">
                  <dd class="">
                    <a href="/demo/grid.html">文章</a>
                  </dd>
                  <dd class="">
                    <a href="/demo/admin.html">视频</a>
                  </dd>
                  <dd class="">
                    <a href="/demo/admin.html">物资</a>
                  </dd>
                </dl>
              </dd>

            </dl>
          </li>

      </div>

    </div>

  </div>


  <script src="/525station/static/layui/layui.js" charset="utf-8"></script>
  <!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->




  <script>
    layui.use('element', function() {
      var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
      //监听导航点击
      element.on('nav(demo)', function(elem) {
        //console.log(elem)
        layer.msg(elem.text());
      });
    });
    layui.use(['laypage', 'layer'], function(){
    var laypage = layui.laypage
    ,layer = layui.layer;
    //不显示首页尾页
        laypage.render({
          elem: 'demo4'
          ,count: 50
          ,first: false
          ,last: false
        });
  });
  </script>

</body>
</html>