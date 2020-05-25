package inheritance;

public class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 15000);
        Truck pickup = new Truck(3, 28, 15, 1000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Truck can transport " + semi.getCargocap() + " kilogram");
        System.out.println("To overcome " + dist + " kilometers  trucker needs " + gallons
                + " gallons of fuel." + System.lineSeparator());

        gallons = pickup.fuelneeded(dist);
        System.out.println("Pickap can transport " + pickup.getCargocap() + " kilogram");
        System.out.println("To overcame " + dist + " kilometers pickap needs " + gallons
                + " gallons of fuel.");
    }
}
