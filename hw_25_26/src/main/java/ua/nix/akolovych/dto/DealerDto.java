package ua.nix.akolovych.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DealerDto {
    private Integer id;
    private String name;
    private String dealerPhone;
}
