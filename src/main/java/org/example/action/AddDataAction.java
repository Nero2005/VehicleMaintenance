package org.example.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.example.dao.FileTestDAO;
import org.example.dao.VehicleDAO;

import java.io.File;

public class AddDataAction extends ActionSupport {
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
        System.out.println(localFile.getAbsolutePath());
        String filePath = localFile.getAbsolutePath();
        int id = VehicleDAO.saveVehicle(chosenOffice, chosenVehicleType, chosenVehicleName, chosenDriver,
        chosenFaultType, complaint, chosenStatus, chosenClient, mileage, location, filePath);
        System.out.println(id);
        return SUCCESS;
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

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
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
