package siddham.models;

import java.util.List;

public class ParkingLot {
    int id;
    List<ParkingFloor> floors;
    List<Gate> gates;
    Status status;

    public ParkingLot(int id, List<ParkingFloor> floors, List<Gate> gates){
        this.id = id;
        this.floors = floors;
        this.gates = gates;
        this.status = Status.Empty;
    }

    public ParkingLot(){
        this.id = 0;
        this.floors = null;
        this.gates = null;
        this.status = Status.Empty;
    }

    public enum Status{
        Full, Empty;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
