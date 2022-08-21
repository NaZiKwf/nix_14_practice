package ua.nix.akolovych.comparator;

import ua.nix.akolovych.entity.Car;

import java.util.Comparator;

public class CompareByModelComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getModel().compareToIgnoreCase(o2.getModel());
    }
}
