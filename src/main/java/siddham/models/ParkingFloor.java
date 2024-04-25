package siddham.models;
import java.util.List;

public class ParkingFloor {
    int id;
    List<ParkingSlot> ParkingSlots;
    int number;
    Status status;

    public enum Status{
        Full, Empty
    }

    public ParkingFloor() {
        this(0, null, 0);
    }

    public ParkingFloor(int id, List<ParkingSlot> parkingSlots, int number){
        this.id = id;
        this.number = number;
        this.ParkingSlots = parkingSlots;
        this.status = Status.Empty;
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

    public List<ParkingSlot> getParkingSlots() {
        return ParkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        ParkingSlots = parkingSlots;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
