package siddham.models;

import java.time.LocalTime;

public class Payment {
    int id;
    Mode mode;
    int amount;
    LocalTime time;
    Status status;

    public enum Status{
        Ongoing, Completed, Failed;
    }

    public enum Mode{
        Cash, Card, UPI, EMI;
    }

    public Payment(int id, Mode mode, int amount, LocalTime time){
        this.id = id;
        this.mode = mode;
        this.amount = amount;
        this.time = time;
        this.status = Status.Ongoing;
    }

    public Payment(){
        this(0, Mode.Cash, 0, null);
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

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }
}
