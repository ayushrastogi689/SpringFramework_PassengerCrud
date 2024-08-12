<%@page import="java.util.List"%>
<%@page import="com.pass.model.Passenger"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
List<Passenger>list=(List<Passenger>)request.getAttribute("list");
%><table border="1" cellspacing="0" cellpading="10">
<tr>
<th>Name</th>
<th>Gender</th>
<th>Country</th>
<th>About you</th>
<th>Mailing list</th>
<th>Action</th>
<th>Action</th>
</tr>
<%
for(Passenger p:list){
	%>
	<tr>
<th><%=p.getName() %></th>
<th><%=p.getGender() %></th>
<th><%=p.getCountry() %></th>
<th><%=p.getAboutyou() %></th>
<th><%=p.getMailinglist() %></th>
<th><button><a href="passenger/delete/<%= p.getId()%>">Delete</a></button></th>
<th><button><a href="passenger/update/<%= p.getId()%>">Update</a></button></th>
</tr>
	<%
}
%>
 </table>
<%
%>

</body>
</html>