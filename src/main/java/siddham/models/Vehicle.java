package siddham.models;

public class Vehicle {
    int id;
    int number;
    ParkingSlot.VehicleType vehicleType;
    Owner owner;

    public Vehicle(int id, int number, ParkingSlot.VehicleType vehicleType, Owner owner){
        this.id = id;
        this.number = number;
        this.vehicleType = vehicleType;
        this.owner = owner;
    }

    public Vehicle(){
        this(0, 0, null, null);
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

    public ParkingSlot.VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(ParkingSlot.VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
