<html>
<head></head>
<body>

<h1>hello</h1>

</body>
<script type="text/javascript" src="assets/js/jquery-1.10.js"></script>
<script >
$(document).ready(function(){
	console.log('here');
	$.getJSON('json/gamesPS3.json', function(data) {
		  var items = [];
		 
		  $.each(data, function(key, val) {
		    items.push('<li id="' + key + '">' + val + '</li>');
		    console.log(val);
		  });
		 
		  $('<ul/>', {
		    'class': 'my-new-list',
		    html: items.join('')
		  }).appendTo('body');
		}).fail(function(data){
			console.log(data);
		});
});

</script>
</html>