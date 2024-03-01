package by.itstep.goutor.oopproject.gasstation.model.entity;

public class Plane extends Transport {
    private String brand;
    private double tank;
    private double capacity;

    public Plane(String brand, double tank, String brand1, double tank1, double capacity) {
        super(brand, tank);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "brand='" + brand + '\'' +
                ", tank=" + tank +
                ", capacity=" + capacity +
                '}';
    }
}
