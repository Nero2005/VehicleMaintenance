package org.example.action;

import com.opensymphony.xwork2.ActionSupport;
import org.example.dao.HistoryDAO;
import org.example.dao.VehicleDAO;
import org.example.hibernate.model.History;
import org.example.hibernate.model.Vehicle;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UpdateAction extends ActionSupport {
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
    private List<History> historyList;
    private List<String> offices = new ArrayList<>();
    private List<String> vehicleTypes = new ArrayList<>();
    private List<String> vehicles = new ArrayList<>();
    private List<String> faultTypes = new ArrayList<>();
    private List<String> drivers = new ArrayList<>();
    private List<String> statuses = new ArrayList<>();
    private List<String> clients = new ArrayList<>();

    public void initializeOffices() {
        offices = new ArrayList<>();
        offices.add("Abuja Office");
        offices.add("AGBARA COMMERCIAL");
        offices.add("Calabar Office");
        offices.add("Head Office Lagos");
    }

    public void initializeVehicleTypes() {
        vehicleTypes = new ArrayList<>();
        vehicleTypes.add("Rental");
        vehicleTypes.add("Lease");
        vehicleTypes.add("Haulage");
        vehicleTypes.add("Backup");
        vehicleTypes.add("Third Party");
    }

    public void initializeVehicles() {
        vehicles = new ArrayList<>();
        vehicles.add("AAA 123 AB (Toyota Camry)");
        vehicles.add("BDC 234 XC (Ford Focus)");
        vehicles.add("DAB 222 BA (Toyota Corolla)");
        vehicles.add("DD 33 EA (Ford Fusion)");
        vehicles.add("FST 234 EX (Mitsubishi Pajero)");
    }

    public void initializeDrivers() {
        drivers = new ArrayList<>();
        drivers.add("Matthew Owoeye");
    }

    public void initializeFaultTypes() {
        faultTypes = new ArrayList<>();
        faultTypes.add("Accident");
        faultTypes.add("Breakdown");
        faultTypes.add("Corrective");
        faultTypes.add("Routine Service");
        faultTypes.add("Inspection");
        faultTypes.add("NA");
    }

    public void initializeStatuses() {
        statuses = new ArrayList<>();
        statuses.add("Submitted");
    }

    public void initializeClients() {
        clients = new ArrayList<>();
        clients.add("Airtel Nigeria");
        clients.add("EKEDP");
        clients.add("FCMB");
        clients.add("Helios Towers");
        clients.add("KPMG");
        clients.add("LM Ericcson");
        clients.add("Petrobas");
        clients.add("Stanbic IBTC");
        clients.add("Walk_in_Client");
    }

    public void initialize() {
        initializeOffices();
        initializeVehicleTypes();
        initializeVehicles();
        initializeDrivers();
        initializeFaultTypes();
        initializeStatuses();
        initializeClients();
        historyList = HistoryDAO.getAllHistory();
        System.out.println("Testing...");
        System.out.println("Testing... again");
        System.out.println(!vehicles.isEmpty());
    }

    @Override
    public String execute() throws Exception {
        Vehicle vehicle = VehicleDAO.getVehicleById(id);
        id = vehicle.getId();
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
        initialize();
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

    public List<History> getHistoryList() {
        return historyList;
    }

    public void setHistoryList(List<History> historyList) {
        this.historyList = historyList;
    }

    public List<String> getOffices() {
        return offices;
    }

    public void setOffices(List<String> offices) {
        this.offices = offices;
    }

    public List<String> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<String> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }

    public List<String> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<String> drivers) {
        this.drivers = drivers;
    }

    public List<String> getFaultTypes() {
        return faultTypes;
    }

    public void setFaultTypes(List<String> faultTypes) {
        this.faultTypes = faultTypes;
    }

    public List<String> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<String> statuses) {
        this.statuses = statuses;
    }

    public List<String> getClients() {
        return clients;
    }

    public void setClients(List<String> clients) {
        this.clients = clients;
    }
}
