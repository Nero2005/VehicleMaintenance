package org.example.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Vehicle implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "OFFICE", nullable = false)
    private String office;

    @Column(name = "VEHICLE_TYPE", nullable = false)
    private String vehicleType;

    @Column(name = "VEHICLE_NAME", nullable = false)
    private String vehicleName;

    @Column(name = "DRIVER", nullable = false)
    private String driver;

    @Column(name = "FAULT_TYPE", nullable = false)
    private String faultType;

    @Column(name = "COMPLAINT", nullable = false)
    private String complaint;

    @Column(name = "STATUS", nullable = false)
    private String status;

    @Column(name = "CLIENT", nullable = false)
    private String client;

    @Column(name = "MILEAGE", nullable = false)
    private Integer mileage;

    @Column(name = "LOCATION", nullable = false)
    private String location;

    @Column(name = "file_path", nullable = false)
    private String filePath;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getFaultType() {
        return faultType;
    }

    public void setFaultType(String faultType) {
        this.faultType = faultType;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
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

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Vehicle))
            return false;
        Vehicle other = (Vehicle) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", office='" + office + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", driver='" + driver + '\'' +
                ", faultType='" + faultType + '\'' +
                ", complaint='" + complaint + '\'' +
                ", status='" + status + '\'' +
                ", client='" + client + '\'' +
                ", mileage=" + mileage +
                ", location='" + location + '\'' +
                '}';
    }
}