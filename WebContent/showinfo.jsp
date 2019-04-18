<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>java sever page</title>
</head>
<body>
	<p> name : <%= request.getAttribute("firstName") %> <%= request.getAttribute("lastName") %><br></p>
</body>
</html>