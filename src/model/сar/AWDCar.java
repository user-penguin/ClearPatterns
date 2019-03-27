package model.сar;

public class AWDCar extends Car {
    AWDCar() {
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

    @Override
    String setGear() {
        return null;
    }
}
