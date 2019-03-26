package model.сar;

public class RWDCar extends Car {
    RWDCar () {
        super();
    }

    @Override
    public String startEngine() {
        return ecu.startEngine();
    }

    @Override
    public String stopEngine() {
        return ecu.stopEngine();
    }

    @Override
    public String setAcceleration(int RPM) {
        return ecu.setRPM(RPM);
    }
}
