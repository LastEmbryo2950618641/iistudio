<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
  <link rel="stylesheet" href="/525station/static/css/animate.css">
  <link rel="stylesheet" href="/525station/static/css/loginpage.css">
  <title>Document</title>
</head>
<body onload="FirstUpdate()">

  <nav class="navbar navbar-inverse navbar-fixed-top headN animate-top-start">
    <div class="container">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
         <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/525station/">IISTUDIO</a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

        <ul class="nav navbar-nav navbar-right">
          <li><a onclick="scrollBody(this)" name="#ourservce" class="ourservce"  href="/525station/InvitateInteriormain">主站</a></li>
          <li><a onclick="scrollBody(this)" name="#ourservce" class="ourservce  active" >Login</a></li>
          <li><a href="/525station/resgiterAccount" onclick="scrollBody(this)" name="#ourschedule">Register</a></li>
          <li><a onclick="scrollBody(this)" name="#ourmenbers" class="navbar-right">Contact us</a></li>


        </ul>

      </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
  </nav>


  <div class="jumbotron jumbotron-login">
   <div class="container-fluid per-container">
      <div class="row row1">
        <div class="col-lg-6 logo animate-left-start">

         <strong>IISTUDIO</strong>
        </div>

        <div class="col-lg-6 upDate animate-right-start">
          <form class="" action="index.html" method="post">


          <div class="row"><div>username:</div><input maxlength="19" name="username" type="text" placeholder="your username"></div>
          <div class="row"><div>password:</div><input maxlength="20" name="password" type="text" placeholder="your password"></div>
          <div class="row securitycode"><div><div>security code:</div><input maxlength="4" name="securitycode" type="text" placeholder="your tel security code"><a href="">send code</a></div></div>
          <div class="row submit"><a href="javascript:void(0);" onclick="submit()" >submit</a></div>
           </form>
        </div>

      </div>
   </div>
 </div>


<script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script type="text/javascript" src="/525station/static/js/animate.js">

</script>
<script type="text/javascript" src="/525station/static/js/loginpage.js">

</script>
</body>

</html>
