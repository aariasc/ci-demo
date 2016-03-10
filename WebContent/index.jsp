<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="demoapp.dao.*"%>
<%@page import="demoapp.model.*"%>
<%@page import="demoapp.utils.*"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>
    

<%
  SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
  PersonDAO dao = new PersonDAO();
  List<Person> result = dao.getAll();
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demoapp</title>

</head>
<body>
<h1>Persons</h1>

<table>
  <tr>
    <th>Id</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Hire Date</th>
    <th>Category</th>
  </tr>  
<% for(int i = 0; i < result.size(); i++)
   {
   Person p = result.get(i);
 %>
 <tr>
  <td><%=p.getId() %></td>
  <td><%=p.getFirstName() %></td>
  <td><%=p.getLastName() %></td>
  <td><%=sf.format(p.getHireDate()) %></td>
  <td><strong><%= PersonCategoryHelper.GetPersonCategory(p.getHireDate()) %></strong></td>
 </tr>
 <%} 
 %>

</body>
</html>