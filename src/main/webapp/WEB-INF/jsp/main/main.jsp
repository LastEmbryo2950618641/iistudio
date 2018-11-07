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




<script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script type="text/javascript" src="/525station/static/enter.js">

</script>
</body>

</html>
