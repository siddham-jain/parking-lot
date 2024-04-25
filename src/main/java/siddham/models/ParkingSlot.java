package siddham.models;

import java.util.List;

public class ParkingSlot {
    int id;
    int number;
    Status status;
    ParkingFloor floor;
    List<VehicleType> VehicleTypes;

    public ParkingSlot(){
        this.id = 0;
        this.number = 0;
        this.status = Status.Empty;
        this.floor = null;
        this.VehicleTypes = null;
    }


    public enum VehicleType {
        TwoWheeler, Sedan, Hatchback, SUV, Electric;
    }

    public enum Status{
        Occupied, Empty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ParkingFloor getFloor() {
        return floor;
    }

    public void setFloor(ParkingFloor floor) {
        this.floor = floor;
    }

    public List<VehicleType> getVehicleTypes() {
        return VehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        VehicleTypes = vehicleTypes;
    }
}
