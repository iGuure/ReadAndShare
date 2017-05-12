$(document).ready(function () {

  $('[data-toggle="offcanvas"]').click(function () {
    $('.row-offcanvas').toggleClass('active')
  });

  loadContent("recBooks");

  $('.tag').click(function() {
  	$(this).parent().children().removeClass("active");
  	$(this).addClass("active");
  	loadContent($(this).attr("title"));
  	$("#content").children().last().prev().remove();
  });

});

function loadContent(tag) {
	$.ajax({
		url: "res/frame/" + tag + ".html",
		type: "GET",
		async: false,
		success: function(result) {
			$("#content").append(result);
		}
	});
}