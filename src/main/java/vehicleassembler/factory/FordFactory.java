package vehicleassembler.factory;

import vehicleassembler.model.Chasis;
import vehicleassembler.model.Motor;
import vehicleassembler.model.Cojineria;

// factory/FordFactory.java
public class FordFactory implements VehicleFactory {

    @Override
    public Chasis createChasis() {
        return new Chasis("Ford Chasis", 4, "Mecánica");
    }

    @Override
    public Motor createMotor() {
        return new Motor("Ford Motor", 250, "Eléctrico");
    }

    @Override
    public Cojineria createCojineria() {
        return new Cojineria("Ford Cojinería", "Tela");
    }
}
