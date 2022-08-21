package ua.nix.akolovych.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Car {
    String id;
    String model;
    String manufacturer;
    Double price;
    Dealer dealer;

}
