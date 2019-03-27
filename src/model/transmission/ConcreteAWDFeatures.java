package model.transmission;

public class ConcreteAWDFeatures implements AWDFeatures {
    private Differential frontDifferential;
    private Differential centralDifferential;
    private Differential rearDifferential;

    // работа с дифференциалами, всё это будет возвращаться при делегировании в  блок управления коробкой
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

    // проверка состояния дифференциалов
    @Override
    public boolean isFrontLocked () {
        return frontDifferential.isLocked();
    }

    @Override
    public boolean isRearLocked () {
        return rearDifferential.isLocked();
    }

    @Override
    public boolean isCentralLocked() {
        return centralDifferential.isLocked();
    }
}
