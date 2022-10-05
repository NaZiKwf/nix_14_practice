package ua.nix.akolovych.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressDto {
    private Integer id;
    private String city;
    private String street;
    private String houseNumber;
}
