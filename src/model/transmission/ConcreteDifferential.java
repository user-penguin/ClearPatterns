package model.transmission;

public class ConcreteDifferential implements Differential {
    private boolean isLocked;

    @Override
    public void locking() {
        isLocked = true;
    }

    @Override
    public void unlocking() {
        isLocked = false;
    }

    @Override
    public boolean isLocked() {
        return isLocked;
    }
}
