package ua.nix.akolovych.api;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.nix.akolovych.db.Car;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DatabaseOperationsToCSV implements DatabaseOperations {
    private static Logger LOGGER_INFO = LoggerFactory.getLogger("info");
    private static DatabaseOperations databaseOperations;
    private static String path;


    private DatabaseOperationsToCSV(){}

    public static DatabaseOperations getConnection(String pathToFile){
        if(databaseOperations == null){
            databaseOperations = new DatabaseOperationsToCSV();
            path = pathToFile;
        }
        LOGGER_INFO.info("Connection to  CSV database");
        return databaseOperations;
    }

    private List<Car> mapFromFileToEntity(List<String[]> records){
        List<Car> cars = new ArrayList<>();
        Iterator<String[]> iterator = records.iterator();

        while (iterator.hasNext()) {
            String[] record = iterator.next();
            Car car = new Car();
            car.setId(Integer.parseInt(record[0]));
            car.setModel(record[1]);
            car.setManufacturer(record[2]);
            car.setPrice(Double.parseDouble(record[3]));
            car.setDealer(record[4]);
            car.setDealerPhone(record[5]);
            cars.add(car);
        }
        return cars;
    }

    private List<String[]> mapFromEntityToRecords(List<Car> cars){
        List<String[]> records = new ArrayList<>();

        Iterator<Car> it = cars.iterator();
        while (it.hasNext()) {
            Car car = it.next();
            records.add(new String[] { car.getId().toString(), car.getModel(), car.getManufacturer(),
                    car.getPrice().toString(), car.getDealer(),car.getDealerPhone()});
        }
        return records;
    }




    private List<String[]> readFile() throws IOException {
        try (CSVReader reader = new CSVReader(new FileReader(path))){
            return reader.readAll();
        } catch (IOException | CsvException ex) {
            throw new IOException(ex.getMessage());
        }
    }

    private void writeToFile(List<String[]> records) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(path))){
            writer.writeAll(records);
        } catch (IOException ex) {
            throw new IOException(ex.getMessage());
        }
    }

    @Override
    public Car getCarById(Integer id) throws IOException {

        List<Car> cars = getAllCars();
        for(Car car : cars){
            if(car.getId() == id){
                return car;
            }

        }
        return null;
    }

    @Override
    public List<Car> getAllCars() throws IOException {
        return mapFromFileToEntity(readFile());
    }

    @Override
    public void deleteCarById(Integer id) throws IOException {
        List <Car> cars = getAllCars();
        for(Car car : cars){
            if(car.getId() == id){
                cars.remove(car);
                LOGGER_INFO.info("Delete car in CSV database");
                break;
            }
        }
        writeToFile(mapFromEntityToRecords(cars));
    }

    @Override
    public void createCar(Car car) throws IOException {
        List<Car> cars = getAllCars();
        for(Car c : cars){
            if(c.getId().equals(car.getId())){
                return;
            }
        }
        cars.add(car);
        LOGGER_INFO.info("Create car in CSV database");
        writeToFile(mapFromEntityToRecords(cars));
    }
    @Override
    public void deleteAllCars() throws IOException {
        writeToFile(new ArrayList<>());
        LOGGER_INFO.info("Delete all cars in CSV database");
    }

}
