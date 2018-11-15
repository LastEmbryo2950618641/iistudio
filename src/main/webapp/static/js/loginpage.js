
function submit() {

  var res = {
    "usernameR": /(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])^[a-zA-Z0-9]{14,19}$/,
    "passwordR": /(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*!|@|#)^[a-zA-Z0-9!@#]{15,20}$/,
  };

  var username,password,code;
    username = $("input[name='username']").val();
    alert(username);
    if (res.usernameR.test(username)) {
      password = $("input[name='password']").val();
      alert(password);
      if (res.passwordR.test(password)) {
    	  
    	  alert(22);
        var isSuccess;
        code = $("input[name='securitycode']").val();
        var codeJson = {
          "securitycode": code
        };
        alert(codeJson.code);
        var strJson = JSON.stringify(codeJson);
        $.ajax ({
          type: "POST",
          url: "/525station/login/login.code",
          contentType: "application/json; charset=utf-8",
          data: strJson,
          dataType: "json",
          success: function(message) {
        	  
              var loginData = {

                "username":username,
                "password":password

              };

              var loginDataJson = JSON.stringify(loginData);
              $.ajax({
                type: "POST",
                url: "/525station/login/loginCheck.php",
                contentType: "application/json; charset=utf-8",
                data: loginDataJson,
                dataType: "json",
                success: function(data) {
                	
                    window.location.assign("/525station/interiormain.php");
                },
                error: function(data) {
                   alert("登陆信息上传错误");
                  isSuccess = false;
                }
              });


              
          },
          error: function(message) {
                alert(message+"验证码错误");
                isSuccess = false;
          }
        });

      
        
      
         

      }
      else {
       alert("密码必须包含大小写，数字，特殊字符！或@或#且15到20");
     }
    }
   else {

      alert("用户名必须包含大小写，数字，且必须在14到19为之间,现在:" + username.length + "位");

  }





}
