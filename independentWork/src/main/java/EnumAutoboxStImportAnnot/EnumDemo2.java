package EnumAutoboxStImportAnnot;

public class EnumDemo2 {
    public static void main(String[] args) {
        Transport tp;

        System.out.println("Speed Airplane: " + Transport.AIRPLANE.getSpeed() + " km/h" + System.lineSeparator());

        System.out.println("Speed transport: ");
        for (Transport t: Transport.values()) {
            System.out.println(t + ": " + t.getSpeed() + " km/h");
        }

    }
}
