package Entites;

public class ParkingLots {
    private int id;
    private String location;
    private static int idGen;
    private int capacity;


    public ParkingLots() {
        id = idGen++;
    }

    public ParkingLots(String loation, int capacity) {
        this();
        this.location = location;
        this.capacity = capacity;
    }
}
