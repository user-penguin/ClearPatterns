package model.builder;

import model.control_unit.ControlUnit;
import model.control_unit.ECU;
import model.control_unit.TCU;
import model.engine.Engine;
import model.transmission.*;
import model.сar.FWDCar;

public class FWDBuilder implements Builder {
    private Engine engine;
    private ECU ecu;
    private FWDTransmission transmission;
    private TCU tcu;
    private ConcreteWheel wheel;

    @Override
    public void addEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void addTransmission(Gearbox gearbox) {
        this.transmission = (FWDTransmission) gearbox;
    }

    @Override
    public void addAWDFeatures(AWDFeatures awdFeatures) {

    }

    @Override
    public void addECU(ControlUnit controlUnit) {
        this.ecu = (ECU) controlUnit;
        ecu.setCarEngine(this.engine);
    }

    @Override
    public void addTCU(ControlUnit controlUnit) {
        this.tcu = (TCU) controlUnit;
        tcu.setTransmission(this.transmission);
    }

    @Override
    public void addWheel(Wheel wheel) {
        this.wheel = (ConcreteWheel) wheel;
    }

    public FWDCar getResult() {
        return null;
    }
}
