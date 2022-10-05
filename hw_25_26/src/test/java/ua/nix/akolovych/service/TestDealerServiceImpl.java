package ua.nix.akolovych.service;

import org.junit.jupiter.api.Test;
import ua.nix.akolovych.dto.CarDto;
import ua.nix.akolovych.entity.Address;
import ua.nix.akolovych.entity.Car;
import ua.nix.akolovych.entity.Dealer;
import ua.nix.akolovych.service.impl.AddressServiceImpl;
import ua.nix.akolovych.service.impl.CarServiceImpl;
import ua.nix.akolovych.service.impl.DealerServiceImpl;
import ua.nix.akolovych.utils.EntityToDto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestDealerServiceImpl {
    private static DealerServiceImpl dealerService = new DealerServiceImpl();
    private static AddressServiceImpl addressService = new AddressServiceImpl();
    private static CarServiceImpl carService = new CarServiceImpl();

    @Test
    void create(){
        Address address1 = new Address(null,"Kyiv","Pochayna","25");
        addressService.create(address1);
        Dealer expected = new Dealer(null, "LUX AUTO","+38096532231",new HashSet<>(),address1);
        dealerService.create(expected);
        Dealer actual = dealerService.getDealer(expected.getId());
        assertEquals(actual,expected);
    }

    @Test
    void update(){
        Address address1 = new Address(null,"Kyiv","Pochayna","25");
        addressService.create(address1);
        Dealer expected = new Dealer(null, "LUX AUTO","+38096532231",new HashSet<>(),address1);
        expected = dealerService.create(expected);
        expected.setName("LUX");
        dealerService.update(expected);
        Dealer actual = dealerService.getDealer(expected.getId());
        assertEquals(actual,expected);
    }

    @Test
    void delete(){
        Address address1 = new Address(null,"Kyiv","Pochayna","25");
        addressService.create(address1);
        Dealer expected = new Dealer(null, "LUX AUTO","+38096532231",new HashSet<>(),address1);
        expected = dealerService.create(expected);
        dealerService.delete(expected.getId());
        Dealer actual = dealerService.getDealer(expected.getId());
        assertNull(actual);
    }

    @Test
    void getAllDealerCars(){
        Address address1 = new Address(null,"Kyiv","Pochayna","25");
        addressService.create(address1);
        Dealer dealer = new Dealer(null, "LUX AUTO","+38096532231",new HashSet<>(),address1);
        dealer = dealerService.create(dealer);
        Car car1 = new Car(null,null,"X5", "BMW", 2000000d);
        carService.create(car1);
        dealerService.addCar(car1.getId(), dealer.getId());
        List<CarDto> expected = new ArrayList<>();
        expected.add(EntityToDto.carEntityToDto(car1));
        List<CarDto> actual = dealerService.getAllDealerCars(dealer.getId());
        assertEquals(actual,expected);
    }

    @Test
    void removeCar(){
        Address address1 = new Address(null,"Kyiv","Pochayna","25");
        addressService.create(address1);
        Dealer dealer = new Dealer(null, "LUX AUTO","+38096532231",new HashSet<>(),address1);
        dealer = dealerService.create(dealer);
        Car car1 = new Car(null,null,"X5", "BMW", 2000000d);
        carService.create(car1);
        dealerService.addCar(car1.getId(),dealer.getId());
        Integer expected = dealerService.removeCar(car1.getId(), dealer.getId());
        Integer actual = car1.getId();
        assertEquals(actual,expected);
    }
}
