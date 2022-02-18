<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: nero
  Date: 2/11/2022
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vehicle Maintenance Request</title>

    <link rel="stylesheet" href="styles/style.css">

</head>
<body>
    <div id="form">
        <%@ include file="header.jsp"%>
        <div id="location">
            <a href="listAction">LIST OF VEHICLE MAINTENANCE REQUESTS</a>
            <span> > </span>
            <a class="currentPage" href="#" aria-disabled="true">NEW VEHICLE MAINTENANCE REQUEST</a>
        </div>
        <div class="tab">
            <button class="tablinks" onclick="openSection(event, 'Details')">DETAILS</button>
            <button class="tablinks" onclick="openSection(event, 'Files')">FILES</button>
            <button class="tablinks" disabled="true" onclick="openSection(event, 'History')">History</button>
        </div>
        <div id="Details" class="tabcontent">
            <s:form action="addDataAction" method="POST" enctype="multipart/form-data">
                <s:select list="offices" name="chosenOffice"
                label="Office" headerKey="None" headerValue=" --Select-- " />
                <s:select list="vehicleTypes" name="chosenVehicleType"
                label="Vehicle" headerKey="None" headerValue=" --Select-- " />
                <s:select list="vehicles" name="chosenVehicleName"
                headerKey="None" headerValue=" --Select-- " />
                <s:select list="drivers" name="chosenDriver"
                label="Driver" headerKey="None" headerValue=" --Select-- " />
                <s:select list="faultTypes" name="chosenFaultType"
                label="Fault Type" headerKey="None" headerValue=" --Select --" />
                <s:textarea label="Complaint" rows="3" cols="80" name="complaint" />
                <s:select list="statuses" name="chosenStatus"
                label="Status" value="Submitted" />
                <s:select list="clients" name="chosenClient"
                label="Client" headerKey="None" headerValue=" --Select-- " />
                <s:textfield label="Mileage/Date" name="mileage" />
<%--                <sx:datetimepicker name="createdDate" label="Create Date" displayFormat="dd-MMM-yyyy" />--%>
<%--                <sx:datetimepicker name="createdTime" displayFormat="HH:mm" />--%>
                <s:textfield label="Location" name="location" />
                <s:file name="uploadedFile" label="File" />
                <s:submit value="Submit" />
            </s:form>
        </div>
        <div id="Files" class="tabcontent">
            <h3>Files</h3>
        </div>

    </div>

</body>
<script src="js/script.js" type="text/javascript"></script>
</html>
