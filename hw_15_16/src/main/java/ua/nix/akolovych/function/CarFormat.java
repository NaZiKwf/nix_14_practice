package ua.nix.akolovych.function;

import ua.nix.akolovych.entity.Car;

import java.util.function.Function;

public class CarFormat implements Function<Car, String>{
    @Override
    public String apply(Car car) {
        String result = "Car("+car.getModel() + " " + car.getPrice() + " " + car.getManufacturer() + " "
                + car.getDealer().getName() + " " + car.getDealer().getPhone() + " " + car.getDealer().getAddress() + ")";

        return result;
    }
}
