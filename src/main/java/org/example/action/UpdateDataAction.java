package org.example.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.example.dao.VehicleDAO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UpdateDataAction extends ActionSupport {
    private int id;
    private String dateTime;
    private String chosenOffice;
    private String chosenVehicleType;
    private String chosenVehicleName;
    private String chosenDriver;
    private String chosenFaultType;
    private String complaint;
    private String chosenStatus;
    private String chosenClient;
    private Integer mileage;
    private String location;
    private File uploadedFile;
    private String uploadedFileContentType;
    private String uploadedFileFileName;
    private String localDirectory = "C:\\temp";

    @Override
    public String execute() throws Exception {
        System.out.println(chosenOffice);
        System.out.println(chosenVehicleType);
        System.out.println(chosenVehicleName);
        System.out.println(chosenDriver);
        System.out.println(chosenFaultType);
        System.out.println(complaint);
        System.out.println(chosenStatus);
        System.out.println(chosenClient);
        System.out.println(mileage);
        System.out.println(location);
        System.out.println(uploadedFileFileName);
        File localFile = new File(localDirectory, uploadedFileFileName);
        FileUtils.copyFile(uploadedFile, localFile);
        String filePath = localFile.getAbsolutePath();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");

        String createdDate = sdf.format(date);
        String createdTime = sdf2.format(date);

        dateTime = createdDate+" "+createdTime;
        VehicleDAO.updateVehicle(id, dateTime, chosenOffice, chosenVehicleType, chosenVehicleName, chosenDriver,
                chosenFaultType, complaint, chosenStatus, chosenClient, mileage, location, filePath);
        return SUCCESS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getChosenOffice() {
        return chosenOffice;
    }

    public void setChosenOffice(String chosenOffice) {
        this.chosenOffice = chosenOffice;
    }

    public String getChosenVehicleType() {
        return chosenVehicleType;
    }

    public void setChosenVehicleType(String chosenVehicleType) {
        this.chosenVehicleType = chosenVehicleType;
    }

    public String getChosenVehicleName() {
        return chosenVehicleName;
    }

    public void setChosenVehicleName(String chosenVehicleName) {
        this.chosenVehicleName = chosenVehicleName;
    }

    public String getChosenDriver() {
        return chosenDriver;
    }

    public void setChosenDriver(String chosenDriver) {
        this.chosenDriver = chosenDriver;
    }

    public String getChosenFaultType() {
        return chosenFaultType;
    }

    public void setChosenFaultType(String chosenFaultType) {
        this.chosenFaultType = chosenFaultType;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getChosenStatus() {
        return chosenStatus;
    }

    public void setChosenStatus(String chosenStatus) {
        this.chosenStatus = chosenStatus;
    }

    public String getChosenClient() {
        return chosenClient;
    }

    public void setChosenClient(String chosenClient) {
        this.chosenClient = chosenClient;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public File getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(File uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    public String getUploadedFileContentType() {
        return uploadedFileContentType;
    }

    public void setUploadedFileContentType(String uploadedFileContentType) {
        this.uploadedFileContentType = uploadedFileContentType;
    }

    public String getUploadedFileFileName() {
        return uploadedFileFileName;
    }

    public void setUploadedFileFileName(String uploadedFileFileName) {
        this.uploadedFileFileName = uploadedFileFileName;
    }
}
