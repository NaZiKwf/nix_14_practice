package ua.nix.akolovych.comparator;

import org.junit.jupiter.api.Test;
import ua.nix.akolovych.entity.Address;
import ua.nix.akolovych.entity.Car;
import ua.nix.akolovych.entity.Dealer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompareByPriceComparator {

    @Test
    void compare_returnInt(){
        CompareByPriceComparator compareByPriceComparator = new CompareByPriceComparator();
        Car car1 = new Car("01","A7","AUDI",200000d,new Dealer("01","SUPER AUTO", new Address("Poltava","Pochayna","4"),"+38945636346"));
        Car car2 = new Car("01","A5","AUDI",250000d,new Dealer("01","SUPER AUTO", new Address("Poltava","Pochayna","4"),"+38945636346"));
        int expected = -1;
        int actual = compareByPriceComparator.compare(car1,car2);
        assertEquals(expected,actual);
    }
}
