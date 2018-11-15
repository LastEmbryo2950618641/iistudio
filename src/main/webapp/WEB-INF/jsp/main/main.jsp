<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0,user-scalable=0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

  <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
  <link rel="stylesheet" href="/525station/static/css/main.css">
  <title>Document</title>
</head>
<body>
  <nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
         <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">IISTUDIO</a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <!--
        <ul class="nav navbar-nav navbar-right indiv">
       <li><a href="#" class="headimage"><img src="./resources/images/example.jpg" alt=""></a></li>
       <li class="dropdown">
         <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">End Emp <span class="caret"></span></a>
         <ul class="dropdown-menu">
           <li><a href="#">your profile</a></li>
           <li><a href="#">your skmming report</a></li>
           <li role="separator" class="divider"></li>
           <li><a href="#">Contact us</a></li>
         </ul>
       </li>
     </ul>
     -->

           <ul class="nav navbar-nav navbar-right indiv">
          <li><a href="#" class="headimage"><img src="/525station/static/images/NoName.PNG" alt=""></a></li>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">no name <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="/525station/login/loginAccount.asp">Login</a></li>
              <li><a href="/525station/resgiter/resgiterAccount.asp">Register</a></li>
              <li role="separator" class="divider"></li>
              <li><a href="#">Contact us</a></li>
            </ul>
          </li>
        </ul>

        <ul class="nav navbar-nav">

          <li><a onclick="scrollBody(this)" name="#ourservce" class="ourservce" >Our Servce</a></li>
          <li><a onclick="scrollBody(this)" name="#ourschedule">Our Schedule</a></li>
          <li><a onclick="scrollBody(this)" name="#ourmenbers" class="navbar-right">Our Menbers</a></li>


        </ul>

      </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
  </nav>
   
   <!--轮播图-->
  <div id="myCarousel" class="carousel slide" >
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"> </li>
			<li data-target="#myCarousel" data-slide-to="1"> </li>
			<li data-target="#myCarousel" data-slide-to="2"> </li>
			
		</ol> 
		<div class="carousel-inner">
			<div class="item active" >
				<img src="./resources/images/l1.jpg" alt="第一张" style="height:50rem;width:100%;" />
			</div>
			<div class="item" >
				<img src="./resources/images/l2.jpg" alt="第二张" style="height:50rem;width:100%;" />
			</div>
			<div class="item">
				<img src="./resources/images/l3.jpg" alt="第三张"  style="height:50rem;width:100%;" />
			</div>
		
		</div>
	
		<a href="#myCarousel" data-slide="prev" class="carousel-control left">
			<span class="glyphicon glyphicon-chevron-left"> </span>
		</a>
		<a href="#myCarousel" data-slide="next" class="carousel-control right">
			<span class="glyphicon glyphicon-chevron-right"> </span>
		</a>
  </div>

<!-- 中部内容-->
<div id="grid">
  <div></div>
  <div id="content">
     <div id="jieshao" class="item">
       <h2>介绍</h2>
       <div class="jieshao_cont">
         <div class="jieshao_cont_img">
           <img src="./resources/images/NoName.PNG">
         </div>
         <div class="jieshao_cont_word">
           <h3>标题</h3>
           <p>文字介绍</p>
        </div>

       </div>
     </div>
     <div id="news" class="item">
        <h2>新闻</h2>
        <div class="news_cont">
          <div class="news_img">
            <h4>某某新闻</h4>
            <img src="./resources/images/NoName.PNG">
            <h5>新闻简单介绍</h5>
          </div>
          <div class="news_img">
              <h4>某某新闻</h4>
              <img src="./resources/images/NoName.PNG">
              <h5>新闻简单介绍</h5>

          </div>
          <div class="news_word">
            <ul >
              <li><a>新闻标题</a><span >日期</span></li>
              <li><a>新闻标题</a><span >日期</span></li>
              <li><a>新闻标题</a><span >日期</span></li>
              <li><a>新闻标题</a><span >日期</span></li>
              <li><a>新闻标题</a><span >日期</span></li>
              <li><a>新闻标题</a><span >日期</span></li>
              <li><a>新闻标题</a><span >日期</span></li>
              <li><a>新闻标题</a><span >日期</span></li>
              <li><a>新闻标题</a><span >日期</span></li>
              <li><a>新闻标题</a><span >日期</span></li>

            </ul>
          </div>

        </div>

     </div>
     <div id="share" class="item">
        <h2>分享</h2>
        <div class="share_cont">
          <div class="share_item">
            <h4><a>标题</a></h4>
            <div><img src="./NoName.PNG"></div>
            <div>文字介绍</div>

          </div>
          <div class="share_item1">
              <h4><a>标题</a></h4>

              <div><img src="./NoName.PNG"></div>
              <div>文字介绍</div>
          </div>
          <div class="share_item">
              <h4><a>标题</a></h4>

              <div><img src="./NoName.PNG"></div>
              <div>文字介绍</div>
          </div>
          <div class="share_item">
              <h4><a>标题</a></h4>

              <div><img src="./NoName.PNG"></div>
              <div>文字介绍</div>
          </div>
        </div>
     </div>
     <div id="arrange" class="item">
        <h2>通知</h2>
        <div class="arrange_cont">
        <div class="arrange_word">
            <ul >
              <li><a>通知</a><span >日期</span></li>
              <li><a>通知</a><span >日期</span></li>
              <li><a>通知</a><span >日期</span></li>
              <li><a>通知</a><span >日期</span></li>
              <li><a>通知</a><span >日期</span></li>
              <li><a>通知</a><span >日期</span></li>
              <li><a>通知</a><span >日期</span></li>
              <li><a>通知</a><span >日期</span></li>
              <li><a>通知</a><span >日期</span></li>
              <li><a>通知</a><span >日期</span></li>
            </ul>
        </div>
        <div class="arrange_gridimg">
        <div class="arrange_button">
          <img src="NoName.PNG">
        </div>
        <div class="arrange_button">
            <img src="NoName.PNG">
          </div>
          <div class="arrange_button">
              <img src="NoName.PNG">
            </div>
            <div class="arrange_button">
                <img src="NoName.PNG">
              </div>
              <div class="arrange_button">
                  <img src="NoName.PNG">
                </div>
                <div class="arrange_button">
                    <img src="NoName.PNG">
                  </div>
                </div>
      </div>
    </div>
  </div>
  <div></div>
</div>
  <!--底部-->
  <div id="ourmenbers" class="jumbotron jumbotron-contact">
      <div class="jumbotron-contact-cover">
        <div class="container">
          <div class="row">
           <div class="col-md-4">
             <address>
                <strong>Twitter, Inc.</strong><br />
                1355 Market Street, Suite 900<br />
                San Francisco, CA 94103<br />
                <abbr title="TellPhone">Tell:</abbr> 12345678901<br />
                QQ:1234567890
                </address>
                <address>
                <strong>Email</strong><br>
                <a href="mailto:#">first.last@example.com</a>
                </address>
           </div>
            <div class="col-md-4 advice">
                  <strong >Submit your advice:</strong><br />
                  <input type="text">
                  <a>submit</a>
            </div>
            <div class="col-md-4 follow">
              <div class="row"><strong >You can follow:</strong></div>
              <div class="row">
                <div class="col-md-2 item"><img src="./resources/images/qq_small.png" alt="qq"></div>
                <div class="col-md-2 item"><img src="./resources/images/weixing.jpg" alt=""></div>
  
                </div>
            </div>
  
          </div>
        </div>
      </div>
    </div>
    






<script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script type="text/javascript" src="/525station/static/main.js">

</script>
</body>

</html>
