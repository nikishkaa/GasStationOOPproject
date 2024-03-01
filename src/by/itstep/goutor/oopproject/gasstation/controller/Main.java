package by.itstep.goutor.oopproject.gasstation.controller;

import by.itstep.goutor.oopproject.gasstation.model.entity.Bus;
import by.itstep.goutor.oopproject.gasstation.model.entity.Car;
import by.itstep.goutor.oopproject.gasstation.model.entity.Plane;
import by.itstep.goutor.oopproject.gasstation.model.entity.Transport;
import by.itstep.goutor.oopproject.gasstation.model.logic.GasManager;
import by.itstep.goutor.oopproject.gasstation.util.view.Printer;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", 50, 250);
        Car car2 = new Car("Mercedes", 60, 300);

        Bus bus1 = new Bus("Scania", 200, 75);
        Bus bus2 = new Bus("Scania", 250, 80);

        Plane plane1 = new Plane("Boing", 1000, 3000);


        Transport[] transports = {car1, car2, bus1, bus2, plane1};


        Printer.print(GasManager.calculateFuel(transports));
    }
}
