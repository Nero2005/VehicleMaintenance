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
    <h1>List</h1>
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
                <td></td>
                <td></td>
                <td rowspan="2"><s:property value="#vehicle.vehicleName" /><br />
                    <s:property value="#vehicle.mileage" />
                </td>
                <td></td>
                <td rowspan="2"><s:property value="#vehicle.office" /><br />
                        <s:property value="#vehicle.client" />
                </td>
                <td><s:property value="#vehicle.complaint" /> </td>
                <td><s:property value="#vehicle.status" /> </td>
                <td>View</td>
                <td>Edit</td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>
