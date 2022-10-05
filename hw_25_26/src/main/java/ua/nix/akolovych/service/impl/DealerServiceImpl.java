package ua.nix.akolovych.service.impl;

import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.nix.akolovych.dto.CarDto;
import ua.nix.akolovych.entity.Car;
import ua.nix.akolovych.entity.Dealer;
import ua.nix.akolovych.service.CarService;
import ua.nix.akolovych.service.DealerService;
import ua.nix.akolovych.utils.EntityManagerFactoryUtil;
import ua.nix.akolovych.utils.EntityToDto;

import java.util.List;

public class DealerServiceImpl implements DealerService {
    private static Logger LOGGER_INFO = LoggerFactory.getLogger("info");
    private final EntityManager entityManager = EntityManagerFactoryUtil.getEntityManager();
    private final CarService carService = new CarServiceImpl();

    @Override
    public Dealer create(Dealer entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        LOGGER_INFO.info("Create dealer" + entity.getId());
        return entity;
    }

    @Override
    public void update(Dealer entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        LOGGER_INFO.info("Update dealer" + entity.getId());
    }

    @Override
    public void delete(Integer id) {
        Dealer dealer = getDealer(id);
        entityManager.getTransaction().begin();
        entityManager.remove(dealer);
        entityManager.getTransaction().commit();
        LOGGER_INFO.info("Delete dealer" + dealer.getId());
    }

    @Override
    public Dealer getDealer(Integer id) {
        return entityManager.find(Dealer.class,id);
    }

    @Override
    public List<CarDto> getAllDealerCars(Integer id) {
        Dealer dealer = getDealer(id);
        List<Car> cars = dealer.getCars().stream().toList();
        LOGGER_INFO.info("Show all dealer" + dealer.getId() + "cars");
        return cars.stream()
                .map(EntityToDto :: carEntityToDto)
                .toList();
    }

    @Override
    public Integer addCar(Integer carId, Integer dealerId) {
        Car car = carService.getCar(carId);
        Dealer dealer = getDealer(dealerId);
        entityManager.getTransaction().begin();
        car.setDealer(dealer);
        dealer.getCars().add(car);
        entityManager.getTransaction().commit();
        LOGGER_INFO.info("Add car to dealer" + dealer.getId());
        return car.getId();
    }

    @Override
    public Integer removeCar(Integer carId, Integer dealerId) {
        Car car = carService.getCar(carId);
        Dealer dealer = getDealer(dealerId);
        entityManager.getTransaction().begin();
        dealer.getCars().remove(car);
        entityManager.remove(car);
        entityManager.getTransaction().commit();
        LOGGER_INFO.info("Remove car from dealer" + dealer.getId());
        return car.getId();
    }
}
