package ua.nix.akolovych.service;

import ua.nix.akolovych.dto.CarDto;
import ua.nix.akolovych.entity.Dealer;

import java.util.List;

public interface DealerService<E extends Dealer> {
    E create(E entity);
    void update(E entity);
    void delete(Integer id);
    Dealer getDealer(Integer id);
    List<CarDto> getAllDealerCars(Integer id);
    Integer addCar(Integer carId,Integer dealerId);
    Integer removeCar(Integer carId,Integer dealerId);
}
