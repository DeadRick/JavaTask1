package org.example;

public class GallonToLiterAdapter extends Liter {

    private Gallon gallons;

    public GallonToLiterAdapter(Gallon gallon) {
        gallons = gallon;
    }

    @Override
    public double getLiters() {
        double res = gallons.getGallon() / 3.79;
        return res;
    }
}
