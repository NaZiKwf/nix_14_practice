package ua.nix.akolovych;

import ua.nix.akolovych.api.DatabaseOperations;
import ua.nix.akolovych.api.DatabaseOperationsToCSV;
import ua.nix.akolovych.api.DatabaseOperationsToJDBC;
import ua.nix.akolovych.db.Car;

import java.io.IOException;
import java.sql.SQLException;

public class Launcher {

    private static final String URL = "jdbc:postgresql:admin";
    private static final String DB_USER = "admin";
    private static final String DB_PASSWORD = "admin";
    private static final String PATH_TO_FILE = "hw_21_22/src/main/resources/db.csv";


    public static void main(String[] args) throws SQLException, IOException {
        Car car = new Car(03,"R8","AUDI", 1000000d,"Badernyi AUTO","+380963424242");
        DatabaseOperations databaseOperations = DatabaseOperationsToCSV.getConnection(PATH_TO_FILE);
        DatabaseOperations databaseOperations1 = DatabaseOperationsToJDBC.getConnection(URL,DB_USER,DB_PASSWORD);
        databaseOperations.createCar(car);
        databaseOperations1.createCar(car);

    }
}
