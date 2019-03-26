package model.control_unit;

import model.transmission.Differential;
import model.transmission.Gearbox;

public class TCU implements ControlUnit {
    private Gearbox gearbox;
    private Differential frontDifferential;
    private Differential rearDifferential;

    public TCU(Gearbox gearbox, Differential frontDifferential, Differential rearDifferential) {
        this.gearbox = gearbox;
        this.frontDifferential = frontDifferential;
        this.rearDifferential = rearDifferential;
    }

    @Override
    public String getStateInfo() {
        return null;
    }
}
