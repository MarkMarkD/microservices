package com.banashko.hotelsmicroservice.web.rest;


import com.banashko.hotelsmicroservice.domain.AbstractEntity;
import com.banashko.hotelsmicroservice.service.AbstractService;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractResource<T extends AbstractEntity> {

    protected Logger log;
    protected Class<T> classType;

    protected final AbstractService<T> service;

    public AbstractResource(AbstractService<T> service,
                            Class<T> classType) {
        this.service = service;
        this.classType = classType;
    }

    @GetMapping
    @Transactional
    public ResponseEntity<List<T>> getAllEntities() {
        log.debug("REST request to get all entities {}", classType.getSimpleName());
        List<T> result = service.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<List<Long>> createEntities(@RequestBody List<T> entities) {
        log.debug("REST request to create new entities {}", classType.getSimpleName());

        if (entities == null || entities.isEmpty())
            return new ResponseEntity("Entities must not be null or empty", HttpStatus.BAD_REQUEST);

        entities.removeIf(entity -> entity.getId() != null);

        List<T> result = service.saveAll(entities);
        return new ResponseEntity<>(result.stream().map(AbstractEntity::getId).collect(Collectors.toList()), HttpStatus.OK);
    }


}
