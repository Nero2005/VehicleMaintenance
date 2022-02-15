package org.example.dao;

import org.example.hibernate.HibernateUtil;
import org.example.hibernate.model.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;


public class VehicleDAO {

    /**
     * This method saves a Vehicle object in database
     */
    public static int saveVehicle(String office, String vehicleType, String vehicleName,
    String driver, String faultType, String complaint, String status, String client,
    Integer mileage, String location, String filePath) {
        Vehicle vehicle = new Vehicle();
        createVehicleObject(office, vehicleType, vehicleName, driver, faultType, complaint,
                status, client, mileage, location, filePath, vehicle);

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        int id = (Integer) session.save(vehicle);
        session.getTransaction().commit();
        session.close();
        return id;
    }

    private static void createVehicleObject(String office, String vehicleType, String vehicleName,
    String driver, String faultType, String complaint, String status, String client,
    Integer mileage, String location, String filePath, Vehicle vehicle) {
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
    }

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
    public static void updateVehicle(int id, String office, String vehicleType, String vehicleName,
    String driver, String faultType, String complaint, String status, String client,
    Integer mileage, String location, String filePath) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Vehicle vehicle = (Vehicle) session.get(Vehicle.class, id);
        createVehicleObject(office, vehicleType, vehicleName, driver, faultType, complaint,
                status, client, mileage, location, filePath, vehicle);
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
