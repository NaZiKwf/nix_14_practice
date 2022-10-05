package ua.nix.akolovych.service.impl;

import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.nix.akolovych.entity.Address;
import ua.nix.akolovych.service.AddressService;
import ua.nix.akolovych.utils.EntityManagerFactoryUtil;


public class AddressServiceImpl implements AddressService {

    private static Logger LOGGER_INFO = LoggerFactory.getLogger("info");
    private final EntityManager entityManager = EntityManagerFactoryUtil.getEntityManager();


    @Override
    public Address create(Address entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        LOGGER_INFO.info("Create address" + entity.getId());
        return entity;
    }

    @Override
    public void update(Address entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        LOGGER_INFO.info("Update address" + entity.getId());
    }

    @Override
    public void delete(Integer id) {
        Address address = getAddress(id);
        entityManager.getTransaction().begin();
        entityManager.remove(address);
        entityManager.getTransaction().commit();
        LOGGER_INFO.info("Delete address" + address.getId());
    }

    @Override
    public Address getAddress(Integer id) {
        return entityManager.find(Address.class,id);
    }
}
