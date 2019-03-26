package model.сar;

public class FWDCar extends Car {
    FWDCar () {
        super();
    }
    @Override
    String setAcceleration(int RPM) {
        return ecu.setRPM(RPM);
    }

    @Override
    public String startEngine() {
        return ecu.startEngine();
    }

    @Override
    public String stopEngine() {
        return ecu.stopEngine();
    }
}
