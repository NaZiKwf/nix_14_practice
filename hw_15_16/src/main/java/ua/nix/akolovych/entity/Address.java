package ua.nix.akolovych.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String city;
    private String street;
    private String houseNumber;
}
