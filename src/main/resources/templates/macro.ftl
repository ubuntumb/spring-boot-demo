<#macro index body="">
<!DOCTYPE html>
<html lang="es">
	<title>Home</title>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="./css/bootstrap.min.css"  type="text/css"/>
	<link rel="stylesheet" href="./css/sb-admin.css" type="text/css">
	<link rel="stylesheet" href="./font-awesome/css/font-awesome.min.css" type="text/css">
	<body>
		<div id='wrapper'>
			<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<#include "./nav_top.ftl">
			<#include "./nav_left.ftl">
		</nav>
		<div id="page-wrapper">
		<#if body != "">
			${body}
		<#else>
			Fecha: ${fecha}
			<br>
			Hora: ${hora}
			<br>
			Mensaje: ${mensaje}
		</#if>
		<div>
		</div>
		<script type="text/javascript>" src="./js/jquery.js" ></script>
		<script type="text/javascript>" src="./js/bootstrap.min.js" ></script>
	</body>
</html>
</#macro>