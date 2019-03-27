package model.builder;

import model.control_unit.ECU;
import model.control_unit.TCU;
import model.engine.CarEngine;
import model.transmission.AWDTransmission;
import model.transmission.ConcreteWheel;
import model.transmission.FWDTransmission;
import model.transmission.RWDTransmission;

public class Director {
    public void constructRWDCar (Builder builder) {
        builder.addEngine(new CarEngine());
        builder.addECU(new ECU());
        builder.addTransmission(new RWDTransmission());
        builder.addTCU(new TCU());
        builder.addWheel(new ConcreteWheel(7));
    }

    public void constructFWDCar (Builder builder) {
        builder.addEngine(new CarEngine());
        builder.addECU(new ECU());
        builder.addTransmission(new FWDTransmission());
        builder.addTCU(new TCU());
        builder.addWheel(new ConcreteWheel(6));
    }

    public void constructAWDCar (Builder builder) {
        builder.addEngine(new CarEngine());
        builder.addECU(new ECU());
        builder.addTransmission(new AWDTransmission());
        builder.addAWDFeatures();
        builder.addTCU(new TCU());
        builder.addWheel(new ConcreteWheel(7));
    }


}
