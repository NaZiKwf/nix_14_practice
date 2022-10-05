package ua.nix.akolovych.service;

import org.junit.jupiter.api.Test;
import ua.nix.akolovych.entity.Address;
import ua.nix.akolovych.entity.Car;
import ua.nix.akolovych.entity.Dealer;
import ua.nix.akolovych.service.impl.AddressServiceImpl;
import ua.nix.akolovych.service.impl.CarServiceImpl;
import ua.nix.akolovych.service.impl.DealerServiceImpl;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestAddressServiceImpl {
    private static DealerServiceImpl dealerService = new DealerServiceImpl();
    private static AddressServiceImpl addressService = new AddressServiceImpl();
    private static CarServiceImpl carService = new CarServiceImpl();

    @Test
    void update(){
        Address address1 = new Address(null,"Kyiv","Pochayna","25");
        addressService.create(address1);
        Dealer dealer = new Dealer(null, "LUX AUTO","+38096532231",new HashSet<>(),address1);
        dealerService.create(dealer);
        Car car = new Car(null,dealer,"X5", "BMW", 2000000d);
        carService.create(car);
        Address expected = new Address(null,"Kyiv","Pochayna","25");
        addressService.create(expected);
        expected = addressService.create(expected);
        expected.setCity("Poltava");
        addressService.update(expected);
        Address actual = addressService.getAddress(expected.getId());
        assertEquals(actual,expected);
    }

    @Test
    void delete(){
        Address address1 = new Address(null,"Kyiv","Pochayna","25");
        addressService.create(address1);
        Dealer dealer = new Dealer(null, "LUX AUTO","+38096532231",new HashSet<>(),address1);
        dealerService.create(dealer);
        Car car = new Car(null,dealer,"X5", "BMW", 2000000d);
        carService.create(car);
        Address expected = new Address(null,"Kyiv","Pochayna","25");
        addressService.create(expected);
        expected = addressService.create(expected);
        addressService.delete(expected.getId());
        Address actual = addressService.getAddress(expected.getId());
        assertNull(actual);
    }
}
