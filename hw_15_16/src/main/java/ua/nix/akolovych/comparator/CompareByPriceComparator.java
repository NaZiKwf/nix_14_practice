package ua.nix.akolovych.comparator;

import ua.nix.akolovych.entity.Car;

import java.util.Comparator;

public class CompareByPriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return c1.getPrice().compareTo(c2.getPrice());
    }
}
