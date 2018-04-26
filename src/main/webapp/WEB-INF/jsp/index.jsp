<%--
  Created by IntelliJ IDEA.
  User: HwyUee
  Date: 2018/4/25
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@page import="com.tw.employee.pojo.Employee" %>
<%@page contentType="text/html; charset=UTF-8" language="java" import="java.util.*" %>
<html >


<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>employee</title>
</head>
<body>
<%
    ArrayList employeeArr = (ArrayList) request.getAttribute("arrEmployee");
    String[] color= {"silver","pink"};
%>
<table id="employeeTable" border="1" align="center" valign="venter">
    <tr>
        <th>id</th><th>name</th><th>age</th><th>sex</th>
    </tr>

    <%
        for(int i = 0;i<employeeArr.size();i++){
            Employee em = (Employee) employeeArr.get(i);
    %>
    <tr bgcolor="<%=color[i%2]%>">
        <td><%=em.getId()%></td>
        <td><%=em.getName()%></td>
        <td><%=em.getAge()%></td>
        <td><%=em.getSex()%></td>
    </tr>
    <%
        }
    %>
</table>
<%

%>
</body>
</html>
