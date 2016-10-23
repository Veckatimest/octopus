<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="static/css/chat.css" />
<script src="static/js/jquery-3.1.1.min.js"></script>
<script src="static/js/chat.js"></script>
<title>chat test window</title>
</head>
<body>
<h2>Hey</h2>
<div id="main_container">

</div>

<script>
$(document).ready( function() {
	var container = $("#main_container");
	var messpool = new MessagePool({container: "main_container", text_class: "message_text"});
	messpool.pushMessage({sender:"Кися", text: "Мяу"});
	messpool.pushMessage({sender:"Песик", text: "Гав!"});
	for(var i = 0; i < 5; i++){
	}
});
	
</script>

</body>
</html>