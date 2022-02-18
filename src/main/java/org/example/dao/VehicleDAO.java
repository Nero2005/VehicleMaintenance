package org.example.dao;

import org.example.hibernate.HibernateUtil;
import org.example.hibernate.model.History;
import org.example.hibernate.model.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;


public class VehicleDAO {

    /**
     * This method saves a Vehicle object in database
     */
    public static int saveVehicle(String dateTime, String office, String vehicleType, String vehicleName,
    String driver, String faultType, String complaint, String status, String client,
    Integer mileage, String location, String filePath) {
        Vehicle vehicle = new Vehicle();
        vehicle.setDateTime(dateTime);
        vehicle.setOffice(office);
        vehicle.setVehicleType(vehicleType);
        vehicle.setVehicleName(vehicleName);
        vehicle.setDriver(driver);
        vehicle.setFaultType(faultType);
        vehicle.setComplaint(complaint);
        vehicle.setStatus(status);
        vehicle.setClient(client);
        vehicle.setMileage(mileage);
        vehicle.setLocation(location);
        vehicle.setFilePath(filePath);

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        int id = (Integer) session.save(vehicle);
        String user = "nologe37@gmail.com";
        String action = "FIRST SUBMITTED";
        String detail = "FIRST SUBMITTED";
        session.getTransaction().commit();
        int id2 = (Integer) HistoryDAO.saveHistory(dateTime, user, action, detail);
        session.close();
        return id;
    }

//    private static void createVehicleObject(String office, String vehicleType, String vehicleName,
//    String driver, String faultType, String complaint, String status, String client,
//    Integer mileage, String location, String filePath, Vehicle vehicle) {
//        vehicle.setOffice(office);
//        vehicle.setVehicleType(vehicleType);
//        vehicle.setVehicleName(vehicleName);
//        vehicle.setDriver(driver);
//        vehicle.setFaultType(faultType);
//        vehicle.setComplaint(complaint);
//        vehicle.setStatus(status);
//        vehicle.setClient(client);
//        vehicle.setMileage(mileage);
//        vehicle.setLocation(location);
//        vehicle.setFilePath(filePath);
//    }

    /**
     * This method returns list of all persisted Vehicle objects/tuples from
     * database
     */
    public static List<Vehicle> getAllVehicles() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<Vehicle> vehicles = (List<Vehicle>) session.createQuery(
                "FROM Vehicle s ORDER BY s.id DESC").list();

        session.getTransaction().commit();
        session.close();
        return vehicles;
    }

    /**
     * This method returns a specific Vehicle object
     */
    public static Vehicle getVehicleById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Vehicle vehicle = (Vehicle) session.get(Vehicle.class, id);

        session.getTransaction().commit();
        session.close();
        return vehicle;
    }

    /**
     * This method updates a specific Vehicle object
     */
    public static void updateVehicle(int id, String dateTime, String office, String vehicleType, String vehicleName,
    String driver, String faultType, String complaint, String status, String client,
    Integer mileage, String location, String filePath) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Vehicle vehicle = (Vehicle) session.get(Vehicle.class, id);
        String currentOffice = vehicle.getOffice();
        String user = "nologe37@gmail.com";
        System.out.println(currentOffice+", "+office);
        if (!currentOffice.equals(office)) {
            String action = "DETAILS UPDATE";
            String detail = "Changed office from "+currentOffice+" to "+office;
            HistoryDAO.saveHistory(dateTime, user, action, detail);
        }
        vehicle.setOffice(office);

        String currentVehicleType = vehicle.getVehicleType();
        if (!currentVehicleType.equals(vehicleType)) {
            String action = "DETAILS UPDATE";
            String detail = "Changed vehicle type from "+currentVehicleType+" to "+vehicleType;
            HistoryDAO.saveHistory(dateTime, user, action, detail);
        }
        vehicle.setVehicleType(vehicleType);

        String currentVehicleName = vehicle.getVehicleName();
        if (!currentVehicleName.equals(vehicleName)) {
            String action = "DETAILS UPDATE";
            String detail = "Changed vehicle name from "+currentVehicleName+" to "+vehicleName;
            HistoryDAO.saveHistory(dateTime, user, action, detail);
        }
        vehicle.setVehicleName(vehicleName);

        String currentDriver = vehicle.getDriver();
        if (!currentDriver.equals(driver)) {
            String action = "DETAILS UPDATE";
            String detail = "Changed driver from "+currentDriver+" to "+driver;
            HistoryDAO.saveHistory(dateTime, user, action, detail);
        }
        vehicle.setDriver(driver);

        String currentFaultType = vehicle.getFaultType();
        if (!currentFaultType.equals(faultType)) {
            String action = "DETAILS UPDATE";
            String detail = "Changed fault type from "+currentFaultType+" to "+faultType;
            HistoryDAO.saveHistory(dateTime, user, action, detail);
        }
        vehicle.setFaultType(faultType);

        String currentComplaint = vehicle.getComplaint();
        if (!currentComplaint.equals(complaint)) {
            String action = "DETAILS UPDATE";
            String detail = "Changed complaint from "+currentComplaint+" to "+complaint;
            HistoryDAO.saveHistory(dateTime, user, action, detail);
        }
        vehicle.setComplaint(complaint);

        String currentStatus = vehicle.getStatus();
        if (!currentStatus.equals(status)) {
            String action = "DETAILS UPDATE";
            String detail = "Changed status from "+currentStatus+" to "+status;
            HistoryDAO.saveHistory(dateTime, user, action, detail);
        }
        vehicle.setStatus(status);

        String currentClient = vehicle.getClient();
        if (!currentClient.equals(client)) {
            String action = "DETAILS UPDATE";
            String detail = "Changed client from "+currentClient+" to "+client;
            HistoryDAO.saveHistory(dateTime, user, action, detail);
        }
        vehicle.setClient(client);

        Integer currentMileage = vehicle.getMileage();
        if (!currentMileage.equals(mileage)) {
            String action = "DETAILS UPDATE";
            String detail = "Changed mileage from "+currentMileage+" to "+mileage;
            HistoryDAO.saveHistory(dateTime, user, action, detail);
        }
        vehicle.setMileage(mileage);

        String currentLocation = vehicle.getLocation();
        if (!currentLocation.equals(location)) {
            String action = "DETAILS UPDATE";
            String detail = "Changed location from "+currentLocation+" to "+location;
            HistoryDAO.saveHistory(dateTime, user, action, detail);
        }
        vehicle.setLocation(location);

        vehicle.setFilePath(filePath);
        //session.update(student);//No need to update manually as it will be updated automatically on transaction close.
        session.getTransaction().commit();
        session.close();
    }


    /**
     * This method deletes a specific Vehicle object
     */
//    public static void deleteVehicle(int id) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//
//        Vehicle vehicle = (Vehicle) session.get(Vehicle.class, id);
//        session.delete(vehicle);
//        session.getTransaction().commit();
//        session.close();
//    }
}
