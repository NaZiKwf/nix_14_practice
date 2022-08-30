package ua.nix.akolovych;

import ua.nix.akolovych.api.CarShop;
import ua.nix.akolovych.entity.Address;
import ua.nix.akolovych.entity.Car;
import ua.nix.akolovych.entity.Dealer;
import ua.nix.akolovych.parser.JSON;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class DatabaseAdapter {
    public List<Car> readCarsShopFromJSONFile(String inputCars) throws IOException {
        byte[] resultArray = Files.readAllBytes(Paths.get(inputCars));
        JSON json = new JSON();
        json.parse(resultArray,0,resultArray.length);
        Object result = json.obj();
        List<Car> cars = new ArrayList<>();
        if(result instanceof LinkedList<?> linkedList){
            for(Object car:linkedList){
                if(car instanceof Map<?,?>){
                    cars.add(carMapToObject((Map) car));
                }
            }
        }
        return cars;
    }

    public void writeCarsShopToJSONFile(List<Car> carsShop, String output) throws IOException{
        List<Map<?,?>> carsHashMap = new LinkedList<>();
        for(Car car : carsShop){
            carsHashMap.add(carObjectToMap(car));
        }
        Files.writeString(Path.of(output), JSON.jsonify(carsHashMap));
    }

    private Car carMapToObject(Map<?,?> carMap){
        String id = carMap.get("id").toString();
        String model = carMap.get("model").toString();
        String manufacturer = carMap.get("manufacturer").toString();
        double price = Double.parseDouble(carMap.get("price").toString());
        Dealer dealer = null;
        if(carMap.get("dealer") instanceof Map<?,?>){
            dealer = dealerMapToObject(((Map) carMap.get("dealer")));
        }
        return new Car(id,model,manufacturer,price,dealer);
    }

    private Dealer dealerMapToObject(Map<?,?> dealerMap){
        String id = dealerMap.get("id").toString();
        String name = dealerMap.get("name").toString();
        String phone = dealerMap.get("phone").toString();
        Address address = null;
        if(dealerMap.get("address") instanceof Map<?,?>){
            address = addressMapToObject(((Map) dealerMap.get("address")));
        }
        return new Dealer(id,name,address,phone);
    }

    private Address addressMapToObject(Map<?,?> addressMap){
        String city = addressMap.get("city").toString();
        String street = addressMap.get("street").toString();
        String houseNumber = addressMap.get("houseNumber").toString();
        return new Address(city,street,houseNumber);
    }

    private Map<?,?> carObjectToMap(Car car){
       Map<String,Object> auto = new HashMap<>();
       auto.put("id",car.getId());
       auto.put("model",car.getModel());
       auto.put("manufacturer",car.getManufacturer());
       auto.put("price",car.getPrice());
       auto.put("dealer",dealerObjectToMap(car.getDealer()));
       return auto;
    }

    private Map<?,?> dealerObjectToMap(Dealer dealer){
        Map<String,Object> dealer1 = new HashMap<>();
        dealer1.put("id",dealer.getId());
        dealer1.put("name",dealer.getName());
        dealer1.put("phone",dealer.getPhone());
        dealer1.put("address",addressObjectToMap(dealer.getAddress()));
        return dealer1;
    }

    private Map<?,?> addressObjectToMap(Address address){
        Map<String,Object> address1 = new HashMap<>();
        address1.put("city",address.getCity());
        address1.put("street",address.getStreet());
        address1.put("houseNumber",address.getHouseNumber());
        return address1;
    }
}
