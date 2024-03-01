package by.itstep.goutor.oopproject.gasstation.model.entity;

public class Bus extends Transport {
    private String brand;
    private double tank;
    private int seat;

    public Bus(String brand, double tank, int seat) {
        super(brand, tank);
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand = " + brand + '\'' +
                ", tank = " + tank +
                ", seat = " + seat +
                '}';
    }
}
