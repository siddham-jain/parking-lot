package siddham.models;
import java.time.LocalTime;
import java.util.List;

public class Bill {
    int id;
    int number;
    LocalTime exitTime;
    int amount;
    List<Payment> payments;
    Status status;
    public Bill(){
        this(0, 0, null, 0, null);
    }
    public Bill(int id, int number, LocalTime exitTime, int amount, List<Payment> payments){
        this.id = id;
        this.number = number;
        this.exitTime = exitTime;
        this.amount = amount;
        this.payments = payments;
        this.status = Status.Unpaid;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalTime exitTime) {
        this.exitTime = exitTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public enum Status{
        Paid, Unpaid;
    }
}
