package org.example.action;

import com.opensymphony.xwork2.ActionSupport;
import org.example.dao.VehicleDAO;
import org.example.hibernate.model.Vehicle;

import java.util.List;

public class ListAction extends ActionSupport {

    private List<Vehicle> vehicles;

    @Override
    public String execute() throws Exception {
        vehicles = VehicleDAO.getAllVehicles();
        return SUCCESS;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
