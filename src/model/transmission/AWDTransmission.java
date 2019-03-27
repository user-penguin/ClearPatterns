package model.transmission;

public class AWDTransmission implements AWDFeatures, Gearbox {
    private final double[] gears = {0, 6, 5, 4, 3.3, 2};
    private final String type = "AWD";
    private int currentGear = 0;

    private Differential frontDifferential;
    private Differential centralDifferential;
    private Differential rearDifferential;

    @Override
    public void lockCentral() {
        centralDifferential.locking();
    }

    @Override
    public void unlockCentral() {
        centralDifferential.unlocking();
    }

    @Override
    public void lockRear() {
        rearDifferential.locking();
    }

    @Override
    public void unlockRear() {
        rearDifferential.unlocking();
    }

    @Override
    public void lockFront() {
        frontDifferential.locking();
    }

    @Override
    public void unlockFront() {
        frontDifferential.unlocking();
    }

    @Override
    public double getSpeed (int rotation) {
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
        return this.type;
    }
}
