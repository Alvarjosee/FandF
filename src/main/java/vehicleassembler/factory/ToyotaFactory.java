package vehicleassembler.factory;


// Importar la interfaz VehicleFactory y los modelos que se van a crear
import vehicleassembler.model.Chasis;
import vehicleassembler.model.Motor;
import vehicleassembler.model.Cojineria;

public class ToyotaFactory implements VehicleFactory {

    @Override
    public Chasis createChasis() {
        return new Chasis("Toyota Chasis", 4, "Automática");
    }

    @Override
    public Motor createMotor() {
        return new Motor("Toyota Motor", 200, "Térmico");
    }

    @Override
    public Cojineria createCojineria() {
        return new Cojineria("Toyota Cojinería", "Cuero");
    }
}

