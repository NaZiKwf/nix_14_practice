package ua.nix.akolovych.service;

import ua.nix.akolovych.dto.AddressDto;
import ua.nix.akolovych.entity.Address;

public interface AddressService<E extends Address> {
    E create(E entity);
    void update(E entity);
    void delete(Integer id);

    Address getAddress(Integer id);
}
