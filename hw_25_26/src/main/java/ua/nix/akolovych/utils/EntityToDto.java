package ua.nix.akolovych.utils;

import ua.nix.akolovych.dto.AddressDto;
import ua.nix.akolovych.dto.CarDto;
import ua.nix.akolovych.dto.DealerDto;
import ua.nix.akolovych.entity.Address;
import ua.nix.akolovych.entity.Car;
import ua.nix.akolovych.entity.Dealer;

import java.util.Objects;


public final class EntityToDto {
    public static CarDto carEntityToDto(Car entity) {
        if(Objects.isNull(entity)){
            return null;
        }
        return new CarDto( entity.getId(),entity.getModel(),entity.getManufacturer(), entity.getPrice());
    }

    public static DealerDto dealerEntityToDto(Dealer entity){
        if(Objects.isNull(entity)){
            return null;
        }
        return new DealerDto(entity.getId(), entity.getName(),entity.getDealerPhone());
    }

    public static AddressDto addressEntityToDto(Address entity){
        if(Objects.isNull(entity)){
            return null;
        }
        return new AddressDto(entity.getId(), entity.getCity(), entity.getStreet(),entity.getHouseNumber());
    }
}
