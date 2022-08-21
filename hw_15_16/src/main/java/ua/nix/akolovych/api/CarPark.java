package ua.nix.akolovych.api;

import ua.nix.akolovych.entity.Car;

import java.util.List;

public interface CarPark {
    List<Car> sortCarsByModel();
    List<Car> sortCarsByPrice();
}
