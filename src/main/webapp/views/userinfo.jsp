<%@page import="java.util.Iterator"%>
<%@page import="in.ashokit.enity.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>
	<%-- User ID: ${user.userid}<br> <br>
	User Name:${user.username} <br> <br>
	User Email:${user.useremail}<br><br> --%>
	
	<%-- <%
	ArrayList<User> list=(ArrayList<User>) request.getAttribute("user");
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		User u=(User)itr.next();
		System.out.println(u.getUserid());
		System.out.println(u.getUsername());
		System.out.println(u.getUseremail());
	}
	
	%> --%>
	
	<c:forEach items="${user}" var="element">  
  <tr> <td>${element.userid}</td>   </tr> <br>
   <tr> <td>${element.username}</td>   </tr>  <br>
    <tr> <td>${element.useremail}</td>   </tr> <br>
    
</c:forEach>
</h4>
</body>
</html>