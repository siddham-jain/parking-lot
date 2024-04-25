package siddham.models;

import java.time.LocalTime;

public class Ticket {
    int id;
    int number;
    Vehicle vehicle;
    ParkingSlot parkingSlot;
    LocalTime entryTime;
    Gate gate;
    Status status;

    public enum Status{
        Active, Paid, Lost;
    }

    public Ticket(int id, int number, Vehicle vehicle, ParkingSlot parkingSlot, LocalTime entryTime, Gate gate){
        this.id = id;
        this.number = number;
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
        this.entryTime = entryTime;
        this.gate = gate;
        this.status = Status.Active;
    }

    public Ticket(){
        this(0, 0, null, null, null, null);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalTime entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
