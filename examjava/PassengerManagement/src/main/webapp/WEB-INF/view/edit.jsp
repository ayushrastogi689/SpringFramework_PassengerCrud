<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="passenger/update/<%=request.getAttribute("id") %>" method="post">
Username:<input type="text" name="name" required><br><br>
Gender:<input type="checkbox" name="gender" value="male">
<input type="checkbox" name="gender" value="female"><br><br>
Select a Country:<select name="country">
<option value="India">India</option>
<option value="Usa">Usa</option>
</select><br><br>
<textarea  name="aboutyou" placeholder="enter about yourself" required>
</textarea><br><br>
<input type="checkbox" name="mailinglist" value="yes">:would youlike  to join our mailing list?
<br><br>
<input type="submit" value="submit">



</form>

</body>
</html>