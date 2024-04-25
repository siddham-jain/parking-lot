package siddham.models;

public class Operator extends User{
    int operatorId;
    Gate gate;
    ParkingFloor parkingFloor;

    public Operator(){
        super("","", "");
        this.operatorId = 0;
        this.gate = null;
        this.parkingFloor = null;
    }

    public Operator(String name, String email, String phone, int operatorId, Gate gate, ParkingFloor parkingFloor) {
        super(name, email, phone);
        this.operatorId = operatorId;
        this.gate = gate;
        this.parkingFloor = parkingFloor;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
