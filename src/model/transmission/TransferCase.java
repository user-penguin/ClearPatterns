package model.transmission;

public abstract class TransferCase {
    private Differential centralDifferential;

    abstract void locking ();
    abstract void unlocking ();
    abstract void rearOn ();
    abstract void rearOff ();
    abstract void frontOn ();
    abstract void frontOff ();
}
