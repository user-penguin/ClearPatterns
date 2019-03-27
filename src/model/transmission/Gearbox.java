package model.transmission;

public interface Gearbox {
    boolean setGear(int numOfGear);

    String getType();

    void setType(String type);

    int getSpeed(int rotation);
}
