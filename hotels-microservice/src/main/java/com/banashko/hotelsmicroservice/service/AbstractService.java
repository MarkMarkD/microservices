package com.banashko.hotelsmicroservice.service;

import com.banashko.hotelsmicroservice.domain.AbstractEntity;
import com.banashko.hotelsmicroservice.repository.AbstractRepository;
import com.banashko.hotelsmicroservice.specification.AbstractSpecification;
import org.slf4j.Logger;

import java.util.List;

public abstract class AbstractService<T extends AbstractEntity> {

    protected Logger log;
    protected final AbstractRepository<T, Long> repository;
    protected final AbstractSpecification<T> specification;

    public AbstractService(AbstractRepository<T, Long> repository, AbstractSpecification<T> specification) {
        this.repository = repository;
        this.specification = specification;
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public List<T> saveAll(List<T> entities) {
        return repository.saveAll(entities);
    }

    public T getById(Long id) {
        return repository.getOne(id);
    }

    public T updateEntity(T entity) throws Exception {
        return repository.save(entity);
    }
}
