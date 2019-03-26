package model.engine;

public interface Engine {
    boolean isStarted();

    boolean isBroken();

    boolean startEngine();

    void stopEngine();

    int getRPM();

    boolean setRPM(int RPM);
}
