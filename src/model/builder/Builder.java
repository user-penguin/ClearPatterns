package model.builder;

import model.control_unit.ControlUnit;
import model.engine.Engine;
import model.transmission.Gearbox;
import model.transmission.Wheel;

public interface Builder {
    void addEngine(Engine engine);

    void addTransmission(Gearbox gearbox);

    void addAWDFeatures();

    void addECU(ControlUnit controlUnit);

    void addTCU(ControlUnit controlUnit);

    void addWheel(Wheel wheel);

}
