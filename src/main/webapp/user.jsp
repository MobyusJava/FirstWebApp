<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Form example POST</h2>
<form action="example2" method="post">
<label>Your name </label><input type="text" name="name"></input>
<br><br><input type="submit" value="Enroll"></input>
</form>

<hr>
<h2>Form example GET</h2>
<form action="example2" method="get">
<label>Your name </label><input type="text" name="name"></input>
<br><br><input type="submit" value="Enroll"></input>
</form>

</body>
</html>