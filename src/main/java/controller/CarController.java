package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CarService;

@RestController
@RequestMapping("/api/cars")

public class CarController {
    private CarService carService;

    @Autowired
    CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public void create(@RequestParam Long ProducerId, @RequestParam String name) {
        carService.create(name, ProducerId);

    }
/*
    @GetMapping
    public Set<CarDto> findAll() {

        return carService.findAll();
    }
    */
//Done
}
