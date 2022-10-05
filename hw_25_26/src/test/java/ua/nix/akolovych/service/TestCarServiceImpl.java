package ua.nix.akolovych.service;

import org.junit.jupiter.api.Test;
import ua.nix.akolovych.entity.Address;
import ua.nix.akolovych.entity.Car;
import ua.nix.akolovych.entity.Dealer;
import ua.nix.akolovych.service.impl.AddressServiceImpl;
import ua.nix.akolovych.service.impl.CarServiceImpl;
import ua.nix.akolovych.service.impl.DealerServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.HashSet;

public class TestCarServiceImpl {
    private static DealerServiceImpl dealerService = new DealerServiceImpl();
    private static AddressServiceImpl addressService = new AddressServiceImpl();
    private static CarServiceImpl carService = new CarServiceImpl();

    @Test
    void create(){
        Address address1 = new Address(null,"Kyiv","Pochayna","25");
        addressService.create(address1);
        Dealer dealer = new Dealer(null, "LUX AUTO","+38096532231",new HashSet<>(),address1);
        dealerService.create(dealer);
        Car expected = new Car(null,dealer,"X5", "BMW", 2000000d);
        carService.create(expected);
        Car actual = carService.getCar(expected.getId());
        assertEquals(actual,expected);
    }

    @Test
    void update(){
        Address address1 = new Address(null,"Kyiv","Pochayna","25");
        addressService.create(address1);
        Dealer dealer = new Dealer(null, "LUX AUTO","+38096532231",new HashSet<>(),address1);
        dealerService.create(dealer);
        Car expected = new Car(null,dealer,"X5", "BMW", 2000000d);
        carService.create(expected);
        expected = carService.create(expected);
        expected.setModel("X6");
        carService.update(expected);
        Car actual = carService.getCar(expected.getId());
        assertEquals(actual,expected);
    }

    @Test

    void delete(){
        Address address1 = new Address(null,"Kyiv","Pochayna","25");
        addressService.create(address1);
        Dealer dealer = new Dealer(null, "LUX AUTO","+38096532231",new HashSet<>(),address1);
        dealerService.create(dealer);
        Car expected = new Car(null,dealer,"X5", "BMW", 2000000d);
        expected = carService.create(expected);
        carService.delete(expected.getId());
        Car actual = carService.getCar(expected.getId());
        assertNull(actual);
    }
}
