package siddham.models;

public class Owner extends User{
    String vehicleNumber;
    Vehicle vehicle;

    public Owner(){
        super("", "", "");
        this.vehicleNumber = "";
        this.vehicle = null;
    }
    public Owner(String name, String email, String phone, String vehicleNumber, Vehicle vehicle) {
        super(name, email, phone);
        this.vehicleNumber = vehicleNumber;
        this.vehicle = vehicle;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
