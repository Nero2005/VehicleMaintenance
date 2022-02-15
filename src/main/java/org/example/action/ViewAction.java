package org.example.action;

import com.opensymphony.xwork2.ActionSupport;
import org.example.dao.VehicleDAO;
import org.example.hibernate.model.Vehicle;

import java.io.File;

public class ViewAction extends ActionSupport {
    private int id;
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
        Vehicle vehicle = VehicleDAO.getVehicleById(id);
        chosenOffice = vehicle.getOffice();
        chosenVehicleType = vehicle.getVehicleType();
        chosenVehicleName = vehicle.getVehicleName();
        chosenDriver = vehicle.getDriver();
        chosenFaultType = vehicle.getFaultType();
        complaint = vehicle.getComplaint();
        chosenStatus = vehicle.getStatus();
        chosenClient = vehicle.getClient();
        mileage = vehicle.getMileage();
        location = vehicle.getLocation();
        uploadedFile = new File(vehicle.getFilePath());
        uploadedFileFileName = uploadedFile.getName();
        System.out.println(vehicle.getDriver());
        return SUCCESS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getLocalDirectory() {
        return localDirectory;
    }

    public void setLocalDirectory(String localDirectory) {
        this.localDirectory = localDirectory;
    }
}
