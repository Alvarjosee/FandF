package vehicleassembler.model;

public class Motor {
    private String model;
    private int maxPower;
    private String technology;

    // Constructor sin argumentos (opcional)
    public Motor() {}

    // Constructor con argumentos
    public Motor(String model, int maxPower, String technology) {
        this.model = model;
        this.maxPower = maxPower;
        this.technology = technology;
    }

    // Getters y Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
