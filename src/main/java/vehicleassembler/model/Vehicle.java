package vehicleassembler.model;

import vehicleassembler.model.Chasis;
import vehicleassembler.model.Motor;
import vehicleassembler.model.Cojineria;

public class Vehicle {
    private String brand;
    private String color;
    private Chasis chasis;
    private Motor motor;
    private Cojineria cojineria;

    // Constructor sin argumentos (opcional)
    public Vehicle() {}

    // Constructor con argumentos
    public Vehicle(String brand, String color, Chasis chasis, Motor motor, Cojineria cojineria) {
        this.brand = brand;
        this.color = color;
        this.chasis = chasis;
        this.motor = motor;
        this.cojineria = cojineria;
    }
    // Constructor, Getters, Setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Cojineria getCojineria() {
        return cojineria;
    }

    public void setCojineria(Cojineria cojineria) {
        this.cojineria = cojineria;
    }
}