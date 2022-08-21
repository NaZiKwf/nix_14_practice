package ua.nix.akolovych.launcher;

import ua.nix.akolovych.api.CarShop;
import ua.nix.akolovych.entity.Address;
import ua.nix.akolovych.entity.Car;
import ua.nix.akolovych.entity.Dealer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Address address1 = new Address("Zhytomyr", "Shevchenka", "46a");
        Address address2 = new Address("Kyiv", "Badornogo", "5");
        Address address3 = new Address("Odessa", "Kozlova", "50");

        Dealer dealer1 = new Dealer("1", "LUX AUTO", address2, "+380999999999");
        Dealer dealer2 = new Dealer("2", "AUTO", address3, "+3809999900999");
        Dealer dealer3 = new Dealer("2", "Domestic car industry", address1, "+3809999900999");

        Car car1 = new Car("1", "X5", "BMW",2000000D,dealer1);
        Car car2 = new Car("2", "Q5", "AUDI", 15000000D, dealer2);
        Car car3 = new Car("3", "DAEWOO LANOS", "ZAZ", 1000000D, dealer3);

        List<Car> carList = Arrays.asList(car1, car2, car3);

        CarShop carShop = new CarShop(new ArrayList<>(List.of(car1,car2,car3)));

        carShop.printAllCars();

        System.out.println("Car created and added to shop");
        Car car4 = new Car("4", "X4", "BMW",20000D,dealer1);
        carShop.add(car4);
        carShop.printAllCars();
        System.out.println("Created car added to shop");

        System.out.println("Read car by id:1 ");
        Car c = carShop.getById("1");
        System.out.println(c);

        System.out.println("Update car by id:1 ");
        Car car5 = new Car("1", "DAEWOO MATIZ", "ZAZ", 10000D, dealer3);
        carShop.update(car5);
        System.out.println("Updated shop: ");
        carShop.printAllCars();

        System.out.println("Delete car by id:1 ");
        carShop.delete("1");
        System.out.println("Updated shop: ");
        carShop.printAllCars();

        System.out.println("Sorted cars by model: ");
        System.out.println(carShop.sortCarsByModel());

        System.out.println("Sorted cars by price: ");
        System.out.println(carShop.sortCarsByPrice());
    }
}
