package org.example.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddAction {
    private List<String> offices = new ArrayList<>();
    private List<String> vehicleTypes = new ArrayList<>();
    private List<String> vehicles = new ArrayList<>();
    private List<String> faultTypes = new ArrayList<>();
    private List<String> drivers = new ArrayList<>();
    private List<String> statuses = new ArrayList<>();
    private List<String> clients = new ArrayList<>();
    private Date currentDate;
    private Date currentTime;

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

    public void initializeDate() {
        Date cdate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        currentDate = cdate;
        SimpleDateFormat stf = new SimpleDateFormat("HH:mm");
        currentTime = cdate;
    }

    public String initialize() {
        initializeOffices();
        initializeVehicleTypes();
        initializeVehicles();
        initializeDrivers();
        initializeFaultTypes();
        initializeStatuses();
        initializeClients();
        initializeDate();
        System.out.println("Testing...");
        System.out.println("Testing... again");
        System.out.println(!vehicles.isEmpty());
        return "success";
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

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }
}
