package ua.nix.akolovych.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dealer {
    String id;
    String name;
    Address address;
    String phone;
}
