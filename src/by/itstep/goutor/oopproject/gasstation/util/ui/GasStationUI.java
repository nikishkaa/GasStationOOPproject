package by.itstep.goutor.oopproject.gasstation.util.ui;

public class GasStationUI {
    private static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getGasStationUI(double tank) {

        return BUILDER.append("Total Gas ").append(tank);
    }
}
