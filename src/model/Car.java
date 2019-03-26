package model;

public abstract class Car {
    private ECU ecu;

    private Engine engine;

    public Car () {
        engine = new Engine();
        ecu = new ECU(engine);
    }

    abstract void setAcceleration();

    abstract void startEngine();

    abstract void stopEngine();

    abstract int checkFuel();

    abstract void addFuel(int count);
}
