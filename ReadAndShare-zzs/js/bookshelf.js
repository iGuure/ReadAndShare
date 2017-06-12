$("#example-navbar-collapse").collapse({
	toggle : true
});

function collapse() {
	$("#example-navbar-collapse").collapse("toggle")

}
function removeElement() {

	$(this).parent().remove();

}
$(".more").children("li").click(function(){
	
	$("#bookTab").children("li").removeClass('active');
})
$("#bookManager").click(function() {
	$(".closeTab").toggle(200);
    $(".closeLayer").toggle(200);
				});
$(".closeLayer").click(removeElement);
$(".closeTab").click(removeElement);
$("#new").click(function() {
	$(this).hide();
     var newInput = $('<li><input type="text" class="form-control input" id="input"></li>')
	 $("#bookTab").children(":last").before(newInput);
	 $(".input").keydown(function(e) {
				
		if (e.keyCode == 13) {
		var name = $(".input").val();
		$(this).remove();
		var newTab = $('<li><a href="" data-toggle="tab">'+
		'</a><div class="closeTab" style="display: none" >'+
		'<a class="glyphicon glyphicon-remove" role="menuitem" tabindex="-1"> </a>'+
		'</div></li></li>');
		newTab.children(":first").append(name);
		$("#bookTab").children(":last").before(newTab);
		$(".closeTab").click(removeElement);
		$("#new").show();
         }
		
	});
	 
});

