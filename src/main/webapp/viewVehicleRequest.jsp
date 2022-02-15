<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: nero
  Date: 2/14/2022
  Time: 7:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
    <link rel="stylesheet" href="styles/style.css">
</head>
<body>
    <div>
        <s:label value="Office: " />
        <s:property value="chosenOffice" /><br/>
        <s:label value="Vehicle Type: " />
        <s:property value="chosenVehicleType" /><br/>
        <s:label value="Vehicle Name: " />
        <s:property value="chosenVehicleName" /><br/>
        <s:label value="Driver: " />
        <s:property value="chosenDriver" /><br/>
        <s:label value="Fault Type: " />
        <s:property value="chosenFaultType" /><br/>
        <s:label value="Complaint: " />
        <s:property value="complaint" /><br/>
        <s:label value="Status: " />
        <s:property value="chosenStatus" /><br/>
        <s:label value="Client: " />
        <s:property value="chosenClient" /><br/>
        <s:label value="Mileage/Date: " />
        <s:property value="mileage" /><br/>
        <s:label value="Location: " />
        <s:property value="location" /><br/>
        <s:label value="File Name: " />
        <s:property value="uploadedFileFileName" /><br/>
    </div>
</body>
</html>
