package model.transmission;

public class RWDTransmission implements Gearbox {
    private final double[] gears = {0, 5, 4, 3, 2, 1, 0.6};
    private final String type = "RWD";
    private int currentGear = 0;

    @Override
    public double getSpeed(int rotation) {
        return rotation / gears[currentGear];
    }

    @Override
    public boolean setGear(int numOfGear) {
        if (numOfGear >= gears.length || numOfGear < 0) {
            return false;
        }
        currentGear = numOfGear;
        return true;
    }

    @Override
    public String getType() {
        return type;
    }
}
