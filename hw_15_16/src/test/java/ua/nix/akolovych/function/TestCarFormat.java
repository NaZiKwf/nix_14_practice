package ua.nix.akolovych.function;

import org.junit.jupiter.api.Test;
import ua.nix.akolovych.entity.Address;
import ua.nix.akolovych.entity.Car;
import ua.nix.akolovych.entity.Dealer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCarFormat {

    @Test
    void apply_returnString(){
        CarFormat carFormat = new CarFormat();
        Car car1 = new Car("01","A7","AUDI",200000d,new Dealer("01","SUPER AUTO", new Address("Poltava","Pochayna","4"),"+38945636346"));
        String expected = "Car(A7 200000.0 AUDI SUPER AUTO +38945636346 Address(city=Poltava, street=Pochayna, houseNumber=4))";
        String actual = carFormat.apply(car1);
        assertEquals(expected,actual);
    }
}
