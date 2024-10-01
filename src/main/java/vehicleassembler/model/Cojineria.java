package vehicleassembler.model;

public class Cojineria {
    private String model;
    private String material;

    // Constructor sin argumentos (opcional)
    public Cojineria() {}

    // Constructor con argumentos
    public Cojineria(String model, String material) {
        this.model = model;
        this.material = material;
    }

    // Getters y Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
