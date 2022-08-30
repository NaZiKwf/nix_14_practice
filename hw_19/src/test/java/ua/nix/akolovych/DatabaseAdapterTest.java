package ua.nix.akolovych;

import org.junit.jupiter.api.Test;
import ua.nix.akolovych.entity.Address;
import ua.nix.akolovych.entity.Car;
import ua.nix.akolovych.entity.Dealer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseAdapterTest {

    @Test
    void readCarsShopFromJSONFile_carsFromJSONFile_returnCars() throws IOException {
        DatabaseAdapter databaseAdapter = new DatabaseAdapter();
        List<Car> expected = new LinkedList<>();
        Car car = new Car("01","X5","BMW",2000000D,new Dealer("01","LUX AUTO",new Address("Mykolaiv","Zelensogo","23"),"+380964365436"));
        expected.add(car);
        List<Car> actual = databaseAdapter.readCarsShopFromJSONFile("src/test/resources/carsRead.json");
        assertEquals(expected,actual);
    }

    @Test
    void writeCarsShopToJSONFile_carsFromMap() throws IOException{
        DatabaseAdapter databaseAdapter = new DatabaseAdapter();
        List<Car> expected = new LinkedList<>();
        Car car = new Car("01","X5","BMW",2000000D,new Dealer("01","LUX AUTO",new Address("Mykolaiv","Zelensogo","23"),"+380964365436"));
        expected.add(car);
        Files.writeString(Path.of("src/test/resources/carsWrite.json"),"");
        databaseAdapter.writeCarsShopToJSONFile(expected,"src/test/resources/carsWrite.json");
        List<Car> actual = databaseAdapter.readCarsShopFromJSONFile("src/test/resources/carsWrite.json");
        assertEquals(expected,actual);
    }
}
