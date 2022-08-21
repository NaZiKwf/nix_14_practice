package ua.nix.akolovych.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.nix.akolovych.comparator.CompareByModelComparator;
import ua.nix.akolovych.comparator.CompareByPriceComparator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ua.nix.akolovych.entity.Car;
import ua.nix.akolovych.function.CarFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public class CarShop implements Shop<Car>, CarPark{
    private static Logger LOGGER_WARN = LoggerFactory.getLogger("warn");
    List<Car> cars;

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public Car getById(String id) {
        for(Car car : cars){
            if(id.equals(car.getId())){
                return car;
            }
        }
        LOGGER_WARN.warn("getById throw NoSuchElementException");
        throw new NoSuchElementException("Car doesn't exist!!!");
    }

    @Override
    public void update(Car car) {
        Car current = getById(car.getId());
        int index = cars.indexOf(current);
        cars.set(index,car);
    }

    @Override
    public Car delete(String id) {
        for(Car car : cars){
            if(id == car.getId()){
                cars.remove(car);
                return car;
            }
        }
        LOGGER_WARN.warn("delete throw NoSuchElementException");
        throw new NoSuchElementException("Car doesn't exist!!!");
    }

    @Override
    public List<Car> sortCarsByModel() {
        return cars.stream()
                .sorted(new CompareByModelComparator())
                .collect(Collectors.toList());

    }

    @Override
    public List<Car> sortCarsByPrice() {
        return cars.stream()
                .sorted(new CompareByPriceComparator())
                .collect(Collectors.toList());
    }

    public void printAllCars(){
        cars.stream()
                .map(new CarFormat())
                .forEach(System.out::println);
    }
}
