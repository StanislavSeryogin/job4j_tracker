package inheritance;

public class Vehicle {
    private int passengers;
    private int fuelcap;
    private int kml;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        kml = m;
    }

    int range() {
        return kml * fuelcap;
    }

    double fuelneeded(int kilometers) {
        return (double) kilometers / kml;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getKml() {
        return kml;
    }

    public void setKml(int kml) {
        this.kml = kml;
    }
}
