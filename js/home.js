$(document).ready(function () {

  $('[data-toggle="offcanvas"]').click(function () {
    $('.row-offcanvas').toggleClass('active')
  });

  loadContent("recBooks");

  $('.tag').click(function() {
  	$(this).parent().children().removeClass("active");
  	$(this).addClass("active");
  	$("#content").children().last().remove();
  	loadContent($(this).attr("title"));
  });

});

function loadContent(tag) {
	$.ajax({
		url: "res/frame/" + tag + ".html",
		type: "GET",
		success: function(result) {
			$("#content").append(result);
		}
	});
}