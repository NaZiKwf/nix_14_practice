package ua.nix.akolovych.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "dealers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dealer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "dealer_name")
    private String name;
    @Column(name = "dealer_phone")
    private String dealerPhone;
    @OneToMany(mappedBy = "dealer", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Set<Car> cars = new HashSet<>();
    @OneToOne
    @JoinColumn(name= "address_id")
    private Address address;
}
