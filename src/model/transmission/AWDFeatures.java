package model.transmission;

public interface AWDFeatures {
    void lockCentral();

    void unlockCentral();

    void lockRear();

    void unlockRear();

    void lockFront();

    void unlockFront();

    boolean isCentralLocked();

    boolean isFrontLocked();

    boolean isRearLocked();
}
