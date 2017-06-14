$(document).ready(function() {
	
	$(".searchInput").keydown(function(event) {
		if (event.keyCode == 13) {
			var content = $(this).val();
			var url = "/ReadAndShare/searchResult?content=" + content;
			$('<a href="' + url + '"></a>').click();
		}
	})
	
})