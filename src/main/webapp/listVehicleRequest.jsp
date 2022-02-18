<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: nero
  Date: 2/11/2022
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="styles/style.css">
</head>
<body>
    <%@ include file="header.jsp"%>
    <div id="location">
        <a class="currentPage" href="#" aria-disabled="true">LIST OF VEHICLE MAINTENANCE REQUESTS</a>
    </div>
    <table class="vehicleTable" align="center">
        <thead>
        <tr>
            <th>#</th>
            <th>Date</th>
            <th>Life Time</th>
            <th>Vehicle/Mileage</th>
            <th>Workshop</th>
            <th>Office/Client</th>
            <th>Complaint</th>
            <th>Status</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <s:iterator value="vehicles" var="vehicle">
            <tr>
                <td><s:property value="#vehicle.id" /> </td>
                <td><s:property value="#vehicle.dateTime" /> </td>
                <td></td>
                <td><s:property value="#vehicle.vehicleName" /><br />
                    <s:property value="#vehicle.mileage" />
                </td>
                <td></td>
                <td><s:property value="#vehicle.office" /><br />
                        <s:property value="#vehicle.client" />
                </td>
                <td><s:property value="#vehicle.complaint" /> </td>
                <td><s:property value="#vehicle.status" /> </td>
                <td><a href="viewAction?id=<s:property value="#vehicle.id" />">
                    View</a></td>
                <td><a href="updateAction?id=<s:property value="#vehicle.id" />">
                    Edit</a></td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>
