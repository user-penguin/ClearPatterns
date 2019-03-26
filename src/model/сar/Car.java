package model.сar;

import model.engine.CarEngine;
import model.control_unit.ECU;
import model.engine.Engine;

public abstract class Car {
    protected ECU ecu;

    private CarEngine carEngine;

    public Car () {
        carEngine = new CarEngine();
        ecu = new ECU(carEngine);
    }

    abstract String setAcceleration(int RPM);

    abstract String  startEngine();

    abstract String stopEngine();
}
