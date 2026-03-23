package Entites;

public class ParkingSpots {
    private int id;
    private String status;
    private static int idGen;

    public ParkingSpots() {
        id = idGen++;
    }

    public ParkingSpots(String status) {
        this();
        this.status = status;
    }
}
