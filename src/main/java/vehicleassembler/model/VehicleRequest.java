package vehicleassembler.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleRequest {
    private String brand;
    private String color;
    private String chasisModel;
    private int numEjes;
    private String transmission;
    private String motorModel;
    private int potenciaMaxima;
    private String tecnologia;
    private String cojineriaModel;
    private String materialCojineria;

    public VehicleRequest() {
    }
}
