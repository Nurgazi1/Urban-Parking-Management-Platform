package Entites;

public class Driver {
    private int id;
    private String name;
    private static int idGen;



    public Driver() {
        id = idGen++;
    }

    public Driver(String name) {
        this();
        this.name = name;
    }
}

