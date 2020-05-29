package EnumAutoboxStImportAnnot;

public class EnumDemo {
    public static void main(String[] args) {
        Transport tp;

        tp = Transport.AIRPLANE;
        System.out.println("Value tp: " + tp + System.lineSeparator());

        tp = Transport.TRAIN;
        System.out.println("tp contains TRAIN" + System.lineSeparator());

        switch (tp) {
            case CAR -> System.out.println("Car");
            case TRUCK -> System.out.println("Truck");
            case AIRPLANE -> System.out.println("Airplane");
            case BOAT -> System.out.println("Boat");
            case TRAIN -> System.out.println("Train");
        }
    }
}
