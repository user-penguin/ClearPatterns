package model.сar;

import model.control_unit.TCU;
import model.engine.CarEngine;
import model.control_unit.ECU;
import model.transmission.Gearbox;

public abstract class Car {
    protected ECU ecu;
    protected TCU tcu;
    protected CarEngine carEngine;
    protected Gearbox gearbox;

    public Car () {
        carEngine = new CarEngine();
        ecu = new ECU(carEngine);
    }

    abstract String setAcceleration(int RPM);

    abstract String  startEngine();

    abstract String stopEngine();

    abstract String setGear();

}
