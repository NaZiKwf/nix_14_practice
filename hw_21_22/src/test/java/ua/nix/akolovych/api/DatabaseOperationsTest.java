package ua.nix.akolovych.api;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import ua.nix.akolovych.db.Car;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Stream;

public class DatabaseOperationsTest {

    static Stream<Arguments> allImpls() throws SQLException {
        return Stream.of(
                Arguments.of(DatabaseOperationsToJDBC.getConnection("jdbc:postgresql:admin","admin","admin")),
                Arguments.of(DatabaseOperationsToCSV.getConnection("src/main/resources/db.csv")));
    }


    @ParameterizedTest
    @MethodSource("allImpls")
    void getCarById_returnCar(DatabaseOperations databaseOperations) throws SQLException, IOException {
        Car expected = new Car(50,"R8","AUDI", 1000000d,"Badernyi AUTO","+380963424242");
        databaseOperations.createCar(expected);
        Car actual = databaseOperations.getCarById(50);
        assertEquals(expected,actual);
        databaseOperations.deleteCarById(50);
    }

    @ParameterizedTest
    @MethodSource("allImpls")
    void deleteCarById_carId(DatabaseOperations databaseOperations) throws SQLException, IOException {
        Car car1 = new Car(50,"R8","AUDI", 1000000d,"Badernyi AUTO","+380963424242");
        databaseOperations.createCar(car1);
        databaseOperations.deleteCarById(50);
        Car actual = databaseOperations.getCarById(50);
        assertNull(actual);
    }

    @ParameterizedTest
    @MethodSource("allImpls")
    void createCar_car(DatabaseOperations databaseOperations) throws SQLException, IOException {
        Car expected = new Car(50,"R8","AUDI", 1000000d,"Badernyi AUTO","+380963424242");
        databaseOperations.createCar(expected);
        Car actual = databaseOperations.getCarById(50);
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @MethodSource("allImpls")
    void getAllCars_returnCars(DatabaseOperations databaseOperations) throws SQLException, IOException {
        databaseOperations.deleteAllCars();
        Car car1 = new Car(50,"R8","AUDI", 1000000d,"Badernyi AUTO","+380963424242");
        Car car2 = new Car(40,"A8","AUDI", 100000d,"AUTO","+3809634242");
        List<Car> expected = List.of(car1,car2);
        for(Car car: expected){
            databaseOperations.createCar(car);
        }
        List<Car> actual = databaseOperations.getAllCars();
        assertEquals(expected,actual);
    }
}
