package vehicle.controller;

import org.springframework.web.bind.annotation.RestController;
import vehicle.service.VehicleService;

@RestController
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }
}
