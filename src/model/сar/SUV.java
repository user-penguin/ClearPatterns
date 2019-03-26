package model.сar;

public class SUV extends Car {
    SUV () {
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
