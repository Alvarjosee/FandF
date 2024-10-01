package vehicleassembler.service;

import vehicleassembler.model.Chasis;
import vehicleassembler.model.Motor;
import vehicleassembler.model.Cojineria;
import vehicleassembler.factory.VehicleFactory;
import vehicleassembler.factory.ToyotaFactory;
import vehicleassembler.factory.FordFactory;
import vehicleassembler.factory.MazdaFactory;
import vehicleassembler.model.Vehicle;
import vehicleassembler.model.builder.VehicleBuilder;
import org.springframework.stereotype.Service;
import vehicleassembler.model.VehicleRequest;
import java.util.ArrayList;
import java.util.List;

// service/VehicleService.java
@Service
public class VehicleService {

    private final List<Vehicle> vehicleList = new ArrayList<>();

    public Vehicle createVehicle(VehicleRequest vehicleRequest) {
        VehicleFactory factory = getFactory(vehicleRequest.getBrand());

        Chasis chasis = factory.createChasis();
        Motor motor = factory.createMotor();
        Cojineria cojineria = factory.createCojineria();

        Vehicle vehicle = new VehicleBuilder()
                .setBrand(vehicleRequest.getBrand())
                .setColor(vehicleRequest.getColor())
                .setChasis(chasis)
                .setMotor(motor)
                .setCojineria(cojineria)
                .build();

        vehicleList.add(vehicle);
        return vehicle;
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleList;
    }

    private VehicleFactory getFactory(String brand) {
        switch (brand.toLowerCase()) {
            case "toyota":
                return new ToyotaFactory();
            case "ford":
                return new FordFactory();
            case "mazda":
                return new MazdaFactory();
            default:
                throw new IllegalArgumentException("Unknown brand: " + brand);
        }
    }
}

