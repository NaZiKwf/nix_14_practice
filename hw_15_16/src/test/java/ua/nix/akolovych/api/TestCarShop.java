package ua.nix.akolovych.api;

import org.junit.jupiter.api.Test;
import ua.nix.akolovych.entity.Address;
import ua.nix.akolovych.entity.Car;
import ua.nix.akolovych.entity.Dealer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCarShop {

   @Test
    void add_carObject(){
        Car car = new Car("01","X10","BMV",200000d,new Dealer("01","SUPER AUTO", new Address("Poltava","Pochayna","4"),"+38945636346"));
        CarShop carShop = new CarShop(new ArrayList<>());
        carShop.add(car);
        List<Car> cars = List.of(car);
        assertEquals(cars,carShop.getCars());
    }

    @Test
    void getById_returnCar(){
        Car car = new Car("01","X10","BMV",200000d,new Dealer("01","SUPER AUTO", new Address("Poltava","Pochayna","4"),"+38945636346"));
        CarShop carShop = new CarShop(new ArrayList<>());
        carShop.add(car);
        Car actual =  carShop.getById("01");
        assertEquals(car,actual);
    }

    @Test
    void getById_returnException(){
        Car car = new Car("01","X10","BMV",200000d,new Dealer("01","SUPER AUTO", new Address("Poltava","Pochayna","4"),"+38945636346"));
        CarShop carShop = new CarShop(new ArrayList<>());
        carShop.add(car);
        assertThrows(NoSuchElementException.class,()->carShop.getById("05"));
    }
    @Test
    void update_carObject(){
        Car car1 = new Car("01","X10","BMV",200000d,new Dealer("01","AUTO", new Address("Zhytomyr","Pochayna","4"),"+38945636346"));
        Car car2 = new Car("01","X10","BMV",200000d,new Dealer("02","SUPER AUTO", new Address("Poltava","Pochayna","4"),"+38945636346"));
        CarShop carShop = new CarShop(new ArrayList<>());
        carShop.add(car1);
        List<Car> cars = List.of(car2);
        carShop.update(car2);
        assertEquals(cars,carShop.getCars());
    }

    @Test
    void delete_returnCar(){
        Car car1 = new Car("01","X10","BMV",200000d,new Dealer("01","AUTO", new Address("Zhytomyr","Pochayna","4"),"+38945636346"));
        CarShop carShop = new CarShop(new ArrayList<>());
        carShop.add(car1);
        Car expected = carShop.delete("01");
        assertEquals(car1,expected);
    }

    @Test
    void delete_returnException(){
        Car car = new Car("01","X10","BMV",200000d,new Dealer("01","SUPER AUTO", new Address("Poltava","Pochayna","4"),"+38945636346"));
        CarShop carShop = new CarShop(new ArrayList<>());
        carShop.add(car);
        assertThrows(NoSuchElementException.class,()->carShop.delete("05"));
    }

    @Test
    void sortCarsByModel_returnSortedCars(){
        CarShop carShop = new CarShop(new ArrayList<>());
        Car car1 = new Car("01","A7","AUDI",200000d,new Dealer("01","SUPER AUTO", new Address("Poltava","Pochayna","4"),"+38945636346"));
        Car car2 = new Car("02","X5","BMW",100000d,new Dealer("02","AUTO", new Address("Kyiv","Shevchenka","5"),"+38945767636346"));
        carShop.add(car2);
        carShop.add(car1);
        List<Car> cars = List.of(car1,car2);
        assertEquals(carShop.sortCarsByModel(),cars);
    }

    @Test
    void sortCarsByPrice_returnSortedCars(){
        CarShop carShop = new CarShop(new ArrayList<>());
        Car car1 = new Car("01","A7","AUDI",200000d,new Dealer("01","SUPER AUTO", new Address("Poltava","Pochayna","4"),"+38945636346"));
        Car car2 = new Car("02","X5","BMW",100000d,new Dealer("02","AUTO", new Address("Kyiv","Shevchenka","5"),"+38945767636346"));
        carShop.add(car1);
        carShop.add(car2);
        List<Car> cars = List.of(car2,car1);
        assertEquals(carShop.sortCarsByPrice(),cars);
    }

    @Test
    void printAllCars_returnAllCars(){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));

        CarShop carShop = new CarShop(new ArrayList<>());
        Car car1 = new Car("01","A7","AUDI",200000d,new Dealer("01","SUPER AUTO", new Address("Poltava","Pochayna","4"),"+38945636346"));
        Car car2 = new Car("02","X5","BMW",100000d,new Dealer("02","AUTO", new Address("Kyiv","Shevchenka","5"),"+38945767636346"));
        carShop.add(car1);
        carShop.add(car2);

        carShop.printAllCars();

        String expectedOutput = "Car(A7 200000.0 AUDI SUPER AUTO +38945636346 Address(city=Poltava, street=Pochayna, houseNumber=4))"+System.lineSeparator() +
                "Car(X5 100000.0 BMW AUTO +38945767636346 Address(city=Kyiv, street=Shevchenka, houseNumber=5))"+System.lineSeparator();

        String actual = byteArrayOutputStream.toString();
        System.setOut(System.out);
        assertEquals(expectedOutput,actual);
    }
}
