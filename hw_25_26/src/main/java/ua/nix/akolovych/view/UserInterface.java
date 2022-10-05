package ua.nix.akolovych.view;

import ua.nix.akolovych.entity.Address;
import ua.nix.akolovych.entity.Car;
import ua.nix.akolovych.entity.Dealer;
import ua.nix.akolovych.service.AddressService;
import ua.nix.akolovych.service.CarService;
import ua.nix.akolovych.service.DealerService;
import ua.nix.akolovych.service.impl.AddressServiceImpl;
import ua.nix.akolovych.service.impl.CarServiceImpl;
import ua.nix.akolovych.service.impl.DealerServiceImpl;

import java.util.HashSet;

public class UserInterface {
    private final AddressService addressService = new AddressServiceImpl();
    private final CarService carService = new CarServiceImpl();
    private final DealerService dealerService = new DealerServiceImpl();

    public void run (){
        Address address1 = new Address(null,"Kyiv","Pochayna","25");
        Address address2 = new Address(null,"Zhytomyr","Shevchenka","37");
        addressService.create(address1);
        addressService.create(address2);
        Dealer dealer1 = new Dealer(null, "LUX AUTO","+38096532231",new HashSet<>(),address1);
        Dealer dealer2 = new Dealer(null, "AUTO","+3809653767231",new HashSet<>(),address2);
        dealerService.create(dealer1);
        dealerService.create(dealer2);
        Car car1 = new Car(null,dealer1,"X5", "BMW", 2000000d);
        Car car2 = new Car(null,dealer1,"RS 7", "AUDI", 2500000d);
        carService.create(car1);
        carService.create(car2);


    }
}
