var image;
var imagebase64;

function clip() {

  var upImage = function(c) {
    image = {
      "x": ""+c.x,
      "y": ""+c.y,
      "x2": ""+c.x2,
      "y2": ""+c.y2,
      "width": ""+c.w,
      "height": ""+c.h,
      "base64":imagebase64
    }

    $(".upImage .doUpImage p").css({
      "color": "green"
    });
    $(".upImage .doUpImage p").html("had file");
    alert(image.width);
  }
  // Create variables (in this scope) to hold the API and image size
  var jcrop_api,
    boundx,
    boundy;




  $('#target').Jcrop({
    onDblClick: upImage,
    aspectRatio: 1 / 1
  }, function() {
    // Use the API to get the real image size
    var bounds = this.getBounds();
    boundx = bounds[0];
    boundy = bounds[1];
    // Store the API in the jcrop_api variable
    jcrop_api = this;

    // Move the preview into the jcrop container for css positioning

  });



}


function showImage() {

  var pathes = $("#upImage").val().split("\\");
  var name = pathes[pathes.length - 1];
  var namearr = name.split(".");
  var suffix = namearr[namearr.length - 1];

  var suffixRegex = /(jpg)|(jpeg)|(png)/i;
  if (suffixRegex.test(suffix)) {

    //读取文件过程方法
    var file = $("#upImage")[0].files[0];
    var reader = new FileReader();
    reader.onloadstart = function(e) {
      console.log("开始读取....");
    }
    reader.onprogress = function(e) {
      console.log("正在读取中....");
    }
    reader.onabort = function(e) {
      console.log("中断读取....");
      alert("中断读取....");
    }
    reader.onerror = function(e) {
      console.log("读取异常....");
      alert("读取异常....");
    }
    reader.onload = function(e) {
      console.log("成功读取....");


      $(".img>*").remove();

      $(".img").append("<img id='target' src='" + e.target.result + "'alt='' style='height:100%;'>");
      imagebase64 = e.target.result ;
      clip();
    }

    reader.readAsDataURL(file);
  } else {
    alert(0);
  }
}

function submit() {
  var res = {
    "usernameR": /(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])^[a-zA-Z0-9]{14,19}$/,
    "passwordR": /(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*!|@|#)^[a-zA-Z0-9!@#]{15,20}$/,
    "tellR": /^[0-9]{11}$/,
    "emailR": /^[0-9a-zA-Z]*@[0-9a-zA-Z]*[.]com$/,
  };
  var nickname, username, password, gender, tell, email, code;

  nickname = $("input[name = 'nickname']").val();
  if (nickname) {
    username = $("input[name='username']").val();
    if (res.usernameR.test(username)) {
      password = $("input[name='password']").val();
      if (res.passwordR.test(password)) {

        if ($("input[name='gender']:checked").val()) {
          gender = $("input[name='gender']:checked").val();
          tell = $("input[name='tell']").val();

          if (res.tellR.test(tell)) {
            email = $("input[name='email']").val();
            if (email.length <= 320) {
              if (res.emailR.test(email)) {
                code = $("input[name='securitycode']").val();
                var isSuccess;
                var codeJson = {
                  "securitycode": code
                };
                var strJson = JSON.stringify(codeJson);
                $.ajax ({
                  type: "POST",
                  url: "",
                  contentType: "application/json; charset=utf-8",
                  data: strJson,
                  dataType: "json",
                  success: function(message) {

                            isSuccess = true;
                  },
                  error: function(message) {
                        alert("验证码错误");
                        isSuccess = false;
                  }
                });

                if(isSuccess)
                {
                   var imageJson = JSON.stringify(image);
                   $.ajax ({
                     type: "POST",
                     url: "",
                     contentType: "application/json; charset=utf-8",
                     data: imageJson,
                     dataType: "json",
                     success: function(message) {

                               isSuccess = true;
                     },
                     error: function(message) {
                        alert("图片上传错误");
                       isSuccess = false;
                     }
                   });

                }

              if(isSuccess) {
                var nickname, username, password, gender, tell, email;
                var registerData = {
                  "nickname":nickname,
                  "username":username,
                  "password":password,
                  "gender":gender,
                  "tell":tell,
                  "email":email
                };

                var registerDataJson = JSON.stringify(registerData);
                $.ajax({
                  type: "POST",
                  url: "",
                  contentType: "application/json; charset=utf-8",
                  data: registerDataJson,
                  dataType: "json",
                  success: function(message) {

                            isSuccess = true;
                            window.location.assign("");
                  },
                  error: function(message) {
                     alert("注册信息上传错误");
                    isSuccess = false;
                  }
                });


              }
              } else {
                {
                  alert("邮件必须按照格式:xxx@xxx.com");
                }
              }
            } else {
              {
                alert("邮件长度要小于320位");
              }
            }
          } else {
            alert("电话号码由数字组成，共11位");
          }

        } else {
          alert("性别必须选择一个");
        }
      } else {
        alert("密码必须包含大小写，数字，特殊字符！或@或#且15到20");
      }
    } else {

        alert("用户名必须包含大小写，数字，且必须在14到19为之间,现在:" + username.length + "位");

    }
  } else {
    {
      alert("nickname不能为空");
    }
  }
}

function tip() {
  alert("选择图片并剪切后，请双击上传.");
}
