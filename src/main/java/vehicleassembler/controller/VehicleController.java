package vehicleassembler.controller;

import vehicleassembler.service.VehicleService;
import vehicleassembler.model.Vehicle;
import vehicleassembler.model.VehicleRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// controller/VehicleController.java

@CrossOrigin(origins = "http://localhost:63342")
@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping
    public ResponseEntity<Vehicle> createVehicle(@RequestBody VehicleRequest vehicleRequest) {
        Vehicle vehicle = vehicleService.createVehicle(vehicleRequest);
        return ResponseEntity.ok(vehicle);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }
}
