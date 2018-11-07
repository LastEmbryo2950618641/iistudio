<%@ page language="java" contentType="text/html; charset=UTF-8"%>

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
  <link rel="stylesheet" href="/525station/static/css/enter.css">

  <title>Document</title>
</head>

<body>
    <img id="backImg" src="/525station/static/images/shutterstock_68453071.jpg" alt="">
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
        <ul class="nav navbar-nav">

          <li><a onclick="scrollBody(this)" name="#ourservce" class="ourservce" >Our Servce</a></li>
          <li><a onclick="scrollBody(this)" name="#ourschedule">Our Schedule</a></li>
          <li><a onclick="scrollBody(this)" name="#ourmenbers">Our Menbers</a></li>


        </ul>

      </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
  </nav>


  <div class="jumbotron jumbotron-enter ">

    <div class="jumbotron-cover">
      <div class="container">
        <div id="enter">
          <h1 id="logo">IISTUDIO</h1>
          <p>a team for woking</p>
          <a href="/525station/main.asp">CLICK HERE</a>
          <span class="glyphicon glyphicon-hand-down"></span>
        </div>
      </div>
    </div>
  </div>

  <div class="jumbotron jumbotron-now">
    <div class="jumbotron-now-cover">
      <div class="container">
        <div class="now-text">
          <h2>My Mission</h2>
          <p>for our race,</p>
          <p>for our peopele,</p>
          <p>for our county,</p>
          <p>for our society,</p>
          <p>for our home,</p>
          <p>for ourself,</p>
          <p>donate our life.</p>
        </div>
      </div>
    </div>
  </div>

  <div id="ourservce" class="jumbotron jumbotron-servce clearFloat">
    <div class="jumbotron-cover">
      <div class="container animate-left-start">
        <div class="row">
          <div class="title col-md-4 col-md-offset-4 center">Our Servce<span>[totol#12]<span></div>
        </div>
        <div class="row ">
          <div class="col col-md-4 center">
            <div class="center item title">1.webFront[#3]</div>
            <div class="center item">custosized web page[$12]</div>
            <div class="center item">custosized js[$12]</div>
            <div class="center item">custosized css[$12]</div>
          </div>
          <div class="col col-md-4 center">
            <div class="center item title">2.webEnd[#3]</div>
            <div class="center item">whited code[$10]</div>
            <div class="center item">built frame[$10]</div>
            <div class="center item">solveing isue[$10]</div>
          </div>
          <div class="col col-md-4 center">
            <div class="center item title">3.webSite[#3]</div>
            <div class="center item">custosized webSite[$90]</div>
            <div class="center item">design webSite[$90]</div>
            <div class="center item">beauty webSite[$90]</div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="ourschedule" class="jumbotron jumbotron-time">
    <div class="jumbotron-time-cover">
      <div class="container">
        <div class="row title">
        <div class="row center main-title">
          Woking Schedule
        </div>
        <div class="row center cy-title">
             week[1-6]
        </div>
        </div>

        <div class=" weeks row center cy-title">
             week[1-3]
        </div>
        <div class="now clearFloat  animate-left-start">
           <div class="col-md-4">
             <ul>
                <li><span class="week">Monday</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">09:30-10:00</span> – study</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">10:00-12:00</span> – study</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">12:00-13:00</span> – having lunch</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">13:00-14:00</span> – work</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">14:30-16:00</span> – study</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">16:00-18:00</span> – study</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">18:00-19:00</span> – having dinner</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">19:00-21:00</span> – work</li>
             </ul>
           </div>
           <div class="col-md-4">
             <ul>
                <li><span class="week">Tuesday</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">09:30-10:00</span> – study</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">10:00-12:00</span> – study</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">12:00-13:00</span> – having lunch</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">13:00-14:00</span> – work</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">14:30-16:00</span> – study</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">16:00-18:00</span> – study</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">18:00-19:00</span> – having dinner</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">19:00-21:00</span> – work</li>
             </ul>
           </div>
           <div class="col-md-4">
             <ul>
                <li><span class="week">Wednesday</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">09:30-10:00</span> – study</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">10:00-12:00</span> – study</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">12:00-13:00</span> – having lunch</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">13:00-14:00</span> – work</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">14:30-16:00</span> – study</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">16:00-18:00</span> – study</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">18:00-19:00</span> – having dinner</li>
                <li><span class="glyphicon glyphicon-time"></span><span class="time-text">19:00-21:00</span> – work</li>
             </ul>
           </div>
        </div>
        <div class="weeks row center">
            week[3-6]
        </div>
           <div class="now clearFloat animate-left-start">
              <div class="col-md-4">
                <ul>
                   <li><span class="week">Thursday</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">09:30-10:00</span> – study</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">10:00-12:00</span> – study</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">12:00-13:00</span> – having lunch</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">13:00-14:00</span> – work</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">14:30-16:00</span> – study</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">16:00-18:00</span> – study</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">18:00-19:00</span> – having dinner</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">19:00-21:00</span> – work</li>
                </ul>
              </div>
              <div class="col-md-4">
                <ul>
                   <li><span class="week">Friday</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">09:30-10:00</span> – study</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">10:00-12:00</span> – study</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">12:00-13:00</span> – having lunch</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">13:00-14:00</span> – work</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">14:30-16:00</span> – study</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">16:00-18:00</span> – study</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">18:00-19:00</span> – having dinner</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">19:00-21:00</span> – work</li>
                </ul>
              </div>
              <div class="col-md-4">
                <ul>
                  <li><span class="week">Saturday</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">09:30-10:00</span> – study</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">10:00-12:00</span> – study</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">12:00-13:00</span> – having lunch</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">13:00-14:00</span> – work</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">14:30-16:00</span> – study</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">16:00-18:00</span> – study</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">18:00-19:00</span> – having dinner</li>
                   <li><span class="glyphicon glyphicon-time"></span><span class="time-text">19:00-21:00</span> – work</li>
                </ul>
              </div>
        </div>


      </div>
    </div>






  </div>


  <div id="ourmenbers" class="jumbotron jumbotron-menber">
    <div class="jumbotron-menber-cover">
      <div class="container">
        <div class="row title">Our Menbers</div>
        <div class="row">
             <div class="col-md-4 item animate-left-start"><div class="img "><img src="/525station/static/images/example.jpg" alt=""> <div class="intro"><div class="per">End Emptiness,a WebEnd Engneer,</div><div class="per">is a hard-working person</div><div class="per">a humerse girl,a beauty</div> </div></div></div>
             <div class="col-md-4 item"><div class="img"><img src="/525station/static/images/example.jpg" alt=""> <div class="intro"><div class="per">End Emptiness,a WebEnd Engneer,</div><div class="per">is a hard-working person</div><div class="per">a humerse girl,a beauty</div> </div></div></div>
             <div class="col-md-4 item animate-right-start"><div class="img"><img src="/525station/static/images/example.jpg" alt=""> <div class="intro"><div class="per">End Emptiness,a WebEnd Engneer,</div><div class="per">is a hard-working person</div><div class="per">a humerse girl,a beauty</div> </div></div></div>
        </div>
        <div class="row">
            <div class="col-md-4 item animate-left-start"><div class="img "><img src="/525station/static/images/example.jpg" alt="">  <div class="intro"><div class="per">End Emptiness,a WebEnd Engneer,</div><div class="per">is a hard-working person</div><div class="per">a humerse girl,a beauty</div> </div></div></div>
            <div class="col-md-4 item"><div class="img"><img src="/525station/static/images/example.jpg" alt="">  <div class="intro"><div class="per">End Emptiness,a WebEnd Engneer,</div><div class="per">is a hard-working person</div><div class="per">a humerse girl,a beauty</div> </div></div></div>
            <div class="col-md-4 item animate-right-start"><div class="img"><img src="/525station/static/images/example.jpg" alt="">  <div class="intro"><div class="per">End Emptiness,a WebEnd Engneer,</div><div class="per">is a hard-working person</div><div class="per">a humerse girl,a beauty</div> </div></div></div>
        </div>

      </div>
    </div>
  </div>




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
                <input type="text"></input>
                <a>submit</a>
          </div>
          <div class="col-md-4 follow">
            <div class="row"><strong >You can follow:</strong></div>
            <div class="row">
              <div class="col-md-2 item"><img src="/525station/static/images/qq_small.png" alt="qq"></div>
              <div class="col-md-2 item"><img src="/525station/static/images/weixing.jpg" alt="weixin"></div>

              </div>
          </div>

        </div>
      </div>
    </div>
  </div>
  </div>
  <script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  <script type="text/javascript" src="/525station/static/js/animate.js">

  </script>
  <script type="text/javascript" src="/525station/static/js/enter.js">

  </script>
</body>

</html>
