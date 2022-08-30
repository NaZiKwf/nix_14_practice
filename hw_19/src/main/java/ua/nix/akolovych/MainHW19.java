package ua.nix.akolovych;

import ua.nix.akolovych.entity.Car;

import java.io.IOException;
import java.util.List;

public class MainHW19 {
    public static void main(String[] args) throws IOException {
        DatabaseAdapter databaseAdapter = new DatabaseAdapter();
        List<Car> cars = databaseAdapter.readCarsShopFromJSONFile("hw_19/src/main/resources/cars.json");
        System.out.println(cars);
        databaseAdapter.writeCarsShopToJSONFile(cars,"hw_19/src/main/resources/cars.json");
    }
}
