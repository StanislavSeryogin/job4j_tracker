package EnumAutoboxStImportAnnot;

public enum Transport {
    CAR(100), TRUCK(80), AIRPLANE(900), TRAIN(120), BOAT(35);

    private int speed;

    Transport(int s) {
        speed = s;
    }

    int getSpeed() {
        return speed;
    }

}
