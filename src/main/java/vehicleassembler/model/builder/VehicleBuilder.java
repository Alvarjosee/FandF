package vehicleassembler.model.builder;

import vehicleassembler.model.Vehicle;
import vehicleassembler.model.Chasis;
import vehicleassembler.model.Motor;
import vehicleassembler.model.Cojineria;

// builder/VehicleBuilder.java
public class VehicleBuilder {
    private String brand;
    private String color;
    private Chasis chasis;
    private Motor motor;
    private Cojineria cojineria;

    public VehicleBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public VehicleBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public VehicleBuilder setChasis(Chasis chasis) {
        this.chasis = chasis;
        return this;
    }

    public VehicleBuilder setMotor(Motor motor) {
        this.motor = motor;
        return this;
    }

    public VehicleBuilder setCojineria(Cojineria cojineria) {
        this.cojineria = cojineria;
        return this;
    }

    public Vehicle build() {
        return new Vehicle(brand, color, chasis, motor, cojineria);
    }
}
