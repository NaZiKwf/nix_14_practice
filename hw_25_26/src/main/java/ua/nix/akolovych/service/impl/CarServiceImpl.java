package ua.nix.akolovych.service.impl;

import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.nix.akolovych.dto.CarDto;
import ua.nix.akolovych.entity.Address;
import ua.nix.akolovych.entity.Car;
import ua.nix.akolovych.service.CarService;
import ua.nix.akolovych.utils.EntityManagerFactoryUtil;
import ua.nix.akolovych.utils.EntityToDto;

public class CarServiceImpl implements CarService {
    private static Logger LOGGER_INFO = LoggerFactory.getLogger("info");
    private final EntityManager entityManager = EntityManagerFactoryUtil.getEntityManager();

    @Override
    public Car create(Car entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        LOGGER_INFO.info("Create car" + entity.getId());
        return entity;
    }

    @Override
    public void update(Car entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        LOGGER_INFO.info("Update car" + entity.getId());
    }

    @Override
    public void delete(Integer id) {
        Car car = getCar(id);
        entityManager.getTransaction().begin();
        entityManager.remove(car);
        entityManager.getTransaction().commit();
        LOGGER_INFO.info("Delete car" + car.getId());
    }

    @Override
    public Car getCar(Integer id) {
        return entityManager.find(Car.class,id);
    }
}
