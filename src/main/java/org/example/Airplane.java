package org.example;

public class Airplane {
    // Объем самолета
    private double volume;

    public Airplane(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public boolean isEnough(Liter lt) {
        return (this.getVolume() <= lt.getLiters());
    }
}
