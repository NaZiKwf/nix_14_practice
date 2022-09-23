package ua.nix.akolovych.api;

import ua.nix.akolovych.db.Car;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface DatabaseOperations {
      Car getCarById(Integer id) throws SQLException, IOException;
      List<Car> getAllCars() throws SQLException, IOException;
      void deleteCarById(Integer id) throws SQLException, IOException;
      void createCar(Car car) throws SQLException, IOException;

      void deleteAllCars() throws SQLException, IOException;
}
