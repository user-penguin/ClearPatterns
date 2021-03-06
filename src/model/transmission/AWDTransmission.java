package model.transmission;

public class AWDTransmission implements Gearbox {
    private final double[] gears = {0, 6, 5, 4, 3.3, 2};
    private final String type = "AWD";
    private int currentGear = 0;
    private AWDFeatures awdFeatures;

    @Override
    public double getSpeed (int rotation) {
        return rotation / gears[currentGear];
    }

    @Override
    public void setAWDFeatures(AWDFeatures awdFeatures) {
        this.awdFeatures = awdFeatures;
    }

    @Override
    public AWDFeatures getAWDFeatures() {
        return this.awdFeatures;
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
        return this.type;
    }
}
