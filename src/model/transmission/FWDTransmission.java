package model.transmission;

public class FWDTransmission implements Gearbox {
    @Override
    public int getSpeed(int rotation) {
        return 0;
    }

    @Override
    public boolean setGear(int numOfGear) {
        return false;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void setType(String type) {

    }
}
