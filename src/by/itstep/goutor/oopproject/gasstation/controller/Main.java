package by.itstep.goutor.oopproject.gasstation.controller;

import by.itstep.goutor.oopproject.gasstation.model.entity.Car;
import by.itstep.goutor.oopproject.gasstation.model.entity.Transport;
import by.itstep.goutor.oopproject.gasstation.util.view.Printer;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", 50, 250);
        Car car2 = new Car("Mercedes", 60, 300);

        

        Printer.print();
    }
}
