package vehicleassembler.factory;

import vehicleassembler.model.Chasis;
import vehicleassembler.model.Motor;
import vehicleassembler.model.Cojineria;

// factory/VehicleFactory.java
public interface VehicleFactory {
    Chasis createChasis();
    Motor createMotor();
    Cojineria createCojineria();
}
