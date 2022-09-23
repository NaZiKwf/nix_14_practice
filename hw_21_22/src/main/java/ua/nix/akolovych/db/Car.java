package ua.nix.akolovych.db;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Car {
    private Integer id;
    private String model;
    private String manufacturer;
    private Double price;
    private String dealer;
    private String dealerPhone;
}
