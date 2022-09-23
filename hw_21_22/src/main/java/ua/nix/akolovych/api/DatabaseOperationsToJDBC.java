package ua.nix.akolovych.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.nix.akolovych.db.Car;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOperationsToJDBC implements DatabaseOperations {
    private static Logger LOGGER_INFO = LoggerFactory.getLogger("info");
    private static DatabaseOperations databaseOperations;

    private static Connection connection;

    private static Statement statement;

    private DatabaseOperationsToJDBC(){}

    public static DatabaseOperations getConnection(String url, String user, String password) throws SQLException {
        if(databaseOperations == null){
            databaseOperations = new DatabaseOperationsToJDBC();
            createConnection(url, user, password);
        }
        LOGGER_INFO.info("Connection to Postgres database");
        return databaseOperations;
    }

    private static void createConnection(String url, String user, String password) throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement();
    }


    private List<Car> mapCarFromResultSet() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from CARS");
        List<Car> cars=new ArrayList<Car>();
        while(resultSet.next()) {
            Car car = new Car();
            car.setId(resultSet.getInt("id"));
            car.setModel(resultSet.getString("model"));
            car.setManufacturer(resultSet.getString("manufacturer"));
            car.setPrice(resultSet.getDouble("price"));
            car.setDealer(resultSet.getString("dealer"));
            car.setDealerPhone(resultSet.getString("dealer_phone"));
            cars.add(car);
        }
        return cars;
    }

    @Override
    public Car getCarById(Integer id) throws SQLException {
        List<Car> cars = mapCarFromResultSet();
        for(Car car : cars){
            if(car.getId() == id){
                return car;
            }

        }
        return null;
    }


    @Override
    public List<Car> getAllCars() throws SQLException {
        return mapCarFromResultSet();
    }

    @Override
    public void deleteCarById(Integer id) throws SQLException {
        statement.executeUpdate(String.format("delete from CARS where id = %s",id));
        LOGGER_INFO.info("Delete car in Postgres database");
    }

    @Override
    public void createCar(Car car) throws SQLException {
        if(getCarById(car.getId())==null){
            statement.executeUpdate(String.format("insert into CARS values(%s, '%s', '%s', %s, '%s', '%s')",
                    car.getId(),car.getModel(),car.getManufacturer(),car.getPrice(),car.getDealer(),car.getDealerPhone()));
            LOGGER_INFO.info("Create car in Postgres database");
        }
    }
    @Override
    public void deleteAllCars() throws SQLException {
        statement.executeUpdate("delete from CARS");
        LOGGER_INFO.info("Delete all cars in Postgres database");
    }

}
