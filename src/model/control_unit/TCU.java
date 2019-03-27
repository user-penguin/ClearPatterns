package model.control_unit;

import model.transmission.Differential;
import model.transmission.Gearbox;

public class TCU implements ControlUnit {
    private Gearbox gearbox;

    public TCU() {
    }

    public void setTransmission(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public TCU(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    @Override
    public String getStateInfo() {
        return null;
    }
}
