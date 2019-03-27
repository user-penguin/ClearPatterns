package model.transmission;

public interface Gearbox {
    boolean setGear(int numOfGear);

    String getType();

    double getSpeed(int rotation);

    // назначение полноприводного набора функций для коробки, не актуально и == null для RWD & FWD
    void setAWDFeatures(AWDFeatures awdFeatures);

    AWDFeatures getAWDFeatures ();

}
