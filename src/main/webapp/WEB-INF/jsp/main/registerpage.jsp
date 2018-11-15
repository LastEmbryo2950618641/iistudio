<%@ page language="java" contentType="text/html; charset=utf-8"%>
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
  <link rel="stylesheet" href="/525station/static/css/registerpage.css">
    <link rel="stylesheet" href="/525station/static/css/jquery.Jcrop.css">


  <script type="text/javascript" src="/525station/static/js/jquery-3.3.1.min.js"></script>
  <script type="text/javascript" src="/525station/static/js/jquery.color.js"></script>
  <script type="text/javascript" src="/525station/static/js/jquery.Jcrop.js"></script>
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
        <a class="navbar-brand" href="#">IISTUDIO</a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

        <ul class="nav navbar-nav navbar-right">

          <li><a onclick="scrollBody(this)" name="#ourservce" class="ourservce  " >Login</a></li>
          <li><a onclick="scrollBody(this)" name="#ourschedule" class="active">Register</a></li>
          <li><a onclick="scrollBody(this)" name="#ourmenbers" class="navbar-right">Contact us</a></li>


        </ul>

      </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
  </nav>


  <div class="jumbotron jumbotron-login">
   <div class="container-fluid per-container">
      <div class="row row1">
        <div class="col-md-6 upImage animate-left-start">
          <div class="row">
              <div class="col-md-2"></div>
            <div class="col-md-8">
             <div class="row"><div class="img img-height"></div></div>
             <div class="row doUpImage">
               <div class="col-md-6"><label for="upImage">select</label><input id="upImage" onchange="showImage()" type="file" accept="image/jp2,image/jpeg,image/png"></input></div>
               <div class="col-md-6"><p href="javascript:void(0);" onclick="javascript:void(0);">no file</p></div>
             </div>
            </div>
              <div class="col-md-2"><a href="javascript:void(0);" onclick="tip()">tip!</a></div>


          </div>


        </div>

        <div class="col-md-6 upDate animate-right-start">

          <div class="row"><div>nickname:</div><input maxlength="100" name="nickname" type="text" placeholder="your nickname"></div>
          <div class="row"><div>username:</div><input maxlength="19" name="username" type="text" placeholder="your username"></div>
          <div class="row"><div>password:</div><input maxlength="20"name="password" type="text" placeholder="your password"></div>
          <div class="row"><div>gender:</div><input type="radio" name="gender" value="male" >男 <input type="radio" name="gender" value="female" >女<input type="radio" name="gender" value="secret" >保密</div>
          <div class="row"><div>tell:</div><input  maxlength="11" name="tell" type="text" placeholder="your tell"></div>
          <div class="row"><div>email:</div><input name="email" type="text" placeholder="your email"></div>
          <div class="row securitycode"><div><div>security code:</div><input  maxlength="6" name="securitycode" type="text" placeholder="your tel security code or email security code"><a href="">send code</a></div></div>
          <div class="row securitycode"><div><div>Invite code:</div><input  maxlength="6" name="Invitecode" type="text" placeholder="Please input Your invitation code"><a href="">send code</a></div></div>
          <div class="row submit"><a href="javascript:void(0);" onclick="submit()" >submit</a></div>

        </div>

      </div>
   </div>
 </div>



<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>



<script type="text/javascript" src="/525station/static/js/animate.js"></script>
<script type="text/javascript" src="/525station/static/js/clipAndUpImage.js"></script>


</body>
</html>
