<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" type="text/css" href="/525station/static/css/normalize.css" />
  <link rel="stylesheet" type="text/css" href="/525station/static/css/demo.css" />
<!--必要样式-->
  <link rel="stylesheet" type="text/css" href="/525station/static/css/component.css" />
  <link rel="stylesheet" href="/525station/static/css/select.css">
  <title>Document</title>
</head>
<body>
  <!-- 代码部分begin -->
    <div class="container demo-1">
        <div class="content">
            <div id="large-header" class="large-header">
                <canvas id="demo-canvas"></canvas>
                <h1 class="main-title">Hi! 五更琉璃小姐 <br / ><span class="thin small">请选着一个您想要的功能</span>
                  <div class="thin small">
                     <a href="/525station/interiormain?user=menber">客户端界面</a>
                  </div>
                  <div class="thin small">
                     <a href="/525station/administrator">管理端界面</a>
                  </div>
                </h1>


            </div>
        </div>
    </div>
    <script src="/525station/static/js/TweenLite.min.js"></script>
    <script src="/525station/static/js/EasePack.min.js"></script>
    <script src="/525station/static/js/rAF.js"></script>
    <script src="/525station/static/js/demo-1.js"></script>
    <!-- 代码部分end -->

</body>
</html>
