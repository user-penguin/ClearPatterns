package model.transmission;

public class ConcreteDifferential implements Differential {
    private boolean isLocked;

    @Override
    public void locking() {

    }

    @Override
    public void unlocking() {

    }

    @Override
    public boolean isLocking() {
        return isLocked;
    }
}
