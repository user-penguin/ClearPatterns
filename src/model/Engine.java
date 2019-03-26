package model;

public class Engine {
    private int RPM;
    private final int maxRPM = 7000;
    private final int minRPM = 300;
    private boolean isStarted;
    private boolean isBroken;

    Engine () {
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

    public int getMaxRPM() {
        return maxRPM;
    }

    public void setRPM(int RPM) {
        if (RPM == maxRPM) {
            isStarted = false;
            isBroken = true;
        } else if (RPM <= minRPM) {
            isStarted = false;
        } else {
            this.RPM = RPM;
        }
    }
}
