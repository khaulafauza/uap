package uap.models;

import uap.bases.Donat;
import uap.interfaces.*;

public class Torus extends Donat implements MenghitungVolume, MenghitungLuas, MenghitungMassa, BiayaKirim, Printable {
    private double radiusUtama;
    private double radiusLubang;

    public Torus(double radiusUtama, double radiusLubang) {
        this.radiusUtama = radiusUtama;
        this.radiusLubang = radiusLubang;
    }

    @Override
    public double getVolume() {
        return 2 * PI * PI * radiusUtama * radiusLubang * radiusLubang;
    }

    @Override
    public double getLuasPermukaan() {
        return 4 * PI * PI * radiusUtama * radiusLubang;
    }

    @Override
    public double getMassa() {
        return getVolume() * THICKNESS * DENSITY;
    }

    @Override
    public double getMassaKg() {
        return getMassa() / 1000;
    }

    @Override
    public int getBiayaKirim() {
        return (int) Math.ceil(getMassaKg()) * 10000;
    }

    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f\n", getVolume());
        System.out.printf("Luas permukaan  : %.2f\n", getLuasPermukaan());
        System.out.printf("Massa           : %.2f\n", getMassa());
        System.out.printf("Massa dalam kg  : %.2f\n", getMassaKg());
        System.out.printf("Biaya kirim     : Rp%d\n", getBiayaKirim());
    }
}