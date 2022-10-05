package ua.nix.akolovych.service;

import ua.nix.akolovych.dto.CarDto;
import ua.nix.akolovych.entity.Car;

public interface CarService<E extends Car> {
    E create(E entity);
    void update(E entity);
    void delete(Integer id);
    Car getCar(Integer id);
}
