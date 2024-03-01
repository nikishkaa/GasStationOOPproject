package by.itstep.goutor.oopproject.gasstation.model.logic;


import by.itstep.goutor.oopproject.gasstation.model.entity.Transport;

public class GasManager {
    public static double calculateFuel(Transport[] transports) {

        double tank = 0;

        for (Transport transport : transports) {
            tank += transport.getTank();
        }

        return tank;
    }
}
