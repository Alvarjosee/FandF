package vehicleassembler.factory;

import vehicleassembler.model.Chasis;
import vehicleassembler.model.Motor;
import vehicleassembler.model.Cojineria;
// factory/MazdaFactory.java
public class MazdaFactory implements VehicleFactory {

    @Override
    public Chasis createChasis() {
        return new Chasis("Mazda Chasis", 4, "Automática");
    }

    @Override
    public Motor createMotor() {
        return new Motor("Mazda Motor", 220, "Híbrido");
    }

    @Override
    public Cojineria createCojineria() {
        return new Cojineria("Mazda Cojinería", "Sintético");
    }
}
