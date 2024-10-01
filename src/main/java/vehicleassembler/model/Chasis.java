package vehicleassembler.model;



public class Chasis {
    private String model;
    private int year;
    private String type;

    // Constructor sin argumentos (opcional)
    public Chasis() {}

    // Constructor con argumentos
    public Chasis(String model, int year, String type) {
        this.model = model;
        this.year = year;
        this.type = type;
    }

    // Getters y Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
