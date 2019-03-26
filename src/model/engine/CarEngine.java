package model.engine;

public class CarEngine implements Engine {
    private int RPM;
    private final int maxRPM = 7000;
    private final int minRPM = 300;
    private boolean isStarted;
    private boolean isBroken;

    public CarEngine() {
        RPM = 0;
        isStarted = false;
        isBroken = false;
    }

    public boolean isStarted () {
        return isStarted;
    }

    public boolean isBroken () {
        return isBroken;
    }

    public boolean startEngine () {
        if (isStarted) {
            return false;
        }
        if (isBroken) {
            return false;
        }
        isStarted = true;
        return true;
    }

    public void stopEngine () {
        isStarted = false;
    }

    public int getRPM() {
        return RPM;
    }

    public boolean setRPM(int RPM) {
        if (RPM == maxRPM) {
            isStarted = false;
            isBroken = true;
            return false;
        } else if (RPM <= minRPM) {
            isStarted = false;
            return false;
        } else {
            this.RPM = RPM;
            return true;
        }
    }
}
