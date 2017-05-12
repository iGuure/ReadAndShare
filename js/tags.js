$(document).ready(function() {
	
	$(".btn").click(function() {
		$(this).css("background-color","yellow");
	});
	
	$("#search").click(function(){
		$("#search").css("background-color","white");
	});

	$("#finishSelect").click(function(){
		$("#finishSelect").css("background-color","gray");
	});
})