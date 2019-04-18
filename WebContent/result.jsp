<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Baggage fee details</title>
</head>
<body>
<h1 align="center"><font color="red">托运费细节</font></h1>
<table width="100%" border="1" align="center">
<tr bgcolor="#949494" align="center">
<th>Item</th><th>Value</th>
</tr>
<%
   request.setCharacterEncoding("UTF-8");
   Enumeration paramNames = request.getParameterNames();

   while(paramNames.hasMoreElements()) {
      String paramName = (String)paramNames.nextElement();
      out.print("<tr align='center' valign='middle'><td>" + paramName + "</td>");
      String paramValue = request.getParameter(paramName);
      out.println("<td>" + paramValue + "</td></tr>");
   }
   String feeVar=(String)request.getSession().getAttribute("totalprice");
   out.print("<tr align='center' valign='middle'><td>Total</td>");
   out.print("<td>"+feeVar+"</td></tr>");
%>
</table>
</body>
</html>