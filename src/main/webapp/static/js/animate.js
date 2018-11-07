

function scrollBody(element) {
    var topTtarget = $($(element).attr("name")).offset().top;
    $("html,body").animate(
      {
        scrollTop:""+topTtarget
      },500
    );
}



function updateHead() {
   $(".headN").addClass("animate-in-bottom");
   $(".headN").removeClass("animate-top-start");
}
function update() {
  if($(".navbar-inverse").offset().top<=0) {
    $(".navbar-inverse").addClass("headtofade");
  }
  else {
    $(".navbar-inverse").removeClass("headtofade");
  }

  for(var i = 0;$(".animate-left-start").length>=i;i++)
  {
        if($($(".animate-left-start")[i]).offset().top-$(window).scrollTop()<=document.body.clientHeight )
        {
        if($($(".animate-left-start")[i]).css("opacity") == "0")
        {
            $($(".animate-left-start")[i]).addClass("animate-in-right");
            $($(".animate-left-start")[i]).removeClass("animate-left-start")
        }
        }

        if($($(".animate-right-start")[i]).offset().top-$(window).scrollTop()<=document.body.clientHeight )
        {
        if($($(".animate-right-start")[i]).css("opacity") == "0")
        {
            $($(".animate-right-start")[i]).addClass("animate-in-left");
            $($(".animate-right-start")[i]).removeClass("animate-right-start")
        }
        }
  }
}
window.addEventListener("scroll",function() {
     update();
});


function FirstUpdate() {
  updateHead();
  update();
}
