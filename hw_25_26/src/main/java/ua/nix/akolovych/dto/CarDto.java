package ua.nix.akolovych.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarDto {
    private Integer id;
    private String model;
    private String manufacturer;
    private Double price;
}
