package model.builder;

import model.control_unit.ControlUnit;
import model.engine.Engine;
import model.transmission.Gearbox;
import model.transmission.Wheel;
import model.сar.RWDCar;

public class RWDBuilder implements Builder {
    @Override
    public void addEngine(Engine engine) {

    }

    @Override
    public void addTransmission(Gearbox gearbox) {

    }

    @Override
    public void addAWDFeatures() {

    }

    @Override
    public void addECU(ControlUnit controlUnit) {

    }

    @Override
    public void addTCU(ControlUnit controlUnit) {

    }

    @Override
    public void addWheel(Wheel wheel) {

    }

    public RWDCar getResult() {
        return null;
    }
}
