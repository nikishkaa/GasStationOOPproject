package by.itstep.goutor.oopproject.gasstation.model.entity;

public class Car extends Transport {

    private String brand;
    private double tank;
    private int power;

    public Car(String brand, double tank, int power) {
        super(brand, tank);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand = " + brand + '\'' +
                ", tank = " + tank +
                ", power = " + power +
                '}';
    }
}
