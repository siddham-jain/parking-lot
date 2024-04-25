package siddham.models;

public class Gate {
    int id;
    int number;
    Operator operator;
    Status status;
    GateType gateType;

    public enum Status{
        Open, Closed;
    }

    public enum GateType{
        Entry, Exit;
    }

    public Gate(){
        this(0, 0, null, null);
    }

    public Gate(int id, int number, Operator operator, GateType gateType){
        this.id = id;
        this.number = number;
        this.operator = operator;
        this.gateType = gateType;
        this.status = Status.Closed;
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

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
