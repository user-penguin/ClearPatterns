package model.transmission;

public interface Gearbox {
    boolean setGear(int numOfGear);

    String getType();

    double getSpeed(int rotation);
}
