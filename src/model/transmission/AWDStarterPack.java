package model.transmission;

public class AWDStarterPack implements AWDFeatures {

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
}
