package model.transmission;

public abstract class AWDTransmission implements AWDFeatures, Gearbox {
    private Differential frontDifferential;
    private Differential centralDifferential;
    private Differential rearDifferential;

    @Override
    public void lockCentral() {

    }

    @Override
    public void unlockCentral() {

    }

    @Override
    public void lockRear() {

    }

    @Override
    public void unlockRear() {

    }

    @Override
    public void lockFront() {

    }

    @Override
    public void unlockFront() {

    }

    @Override
    public boolean setGear(int numOfGear) {
        return false;
    }
}
