package model.transmission;

public class ConcreteWheel implements Wheel {
    private double ratio;

    public ConcreteWheel(double ratio) {
        this.ratio = ratio;
    }

    @Override
    public double getRatio() {
        return ratio;
    }
}
