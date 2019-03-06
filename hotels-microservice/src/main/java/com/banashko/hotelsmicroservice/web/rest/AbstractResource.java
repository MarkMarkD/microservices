package com.banashko.hotelsmicroservice.web.rest;


import com.banashko.hotelsmicroservice.domain.AbstractEntity;
import com.banashko.hotelsmicroservice.service.AbstractService;
import com.banashko.hotelsmicroservice.service.RoomService;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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

    /**
     * GET all entities
     *
     * @return : response entity with Status 200 OK all entities in body
     */
    @GetMapping("")
    @Transactional
    public ResponseEntity<List<T>> getAllEntities() {
        log.debug("REST request to get all entities {}", classType.getSimpleName());
        List<T> result = service.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    /**
     * GET entity by id
     *
     * @param id : the id of the entity
     * @return : response entity with Status 200 OK and needed entity in body
     */
    @GetMapping("/{id}")
    @Transactional
    public ResponseEntity<T> getById(@PathVariable Long id) {
        log.debug("REST request to get entity by id: {}, {}", classType.getSimpleName(), id);
        T entity = service.getById(id);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    /**
     * POST create new entities
     *
     * @param entities : list of entities to create
     * @return : response entity with Status 201 CREATED and list of ids of created entities, or Status 400 BAD REQUEST
     */
    @PostMapping("")
    @Transactional
    public ResponseEntity<List<Long>> createEntities(@RequestBody List<T> entities) {
        log.debug("REST request to create new entities {}", classType.getSimpleName());

        if (entities == null || entities.isEmpty())
            return new ResponseEntity("Entities must not be null or empty", HttpStatus.BAD_REQUEST);

        entities.removeIf(entity -> entity.getId() != null);

        List<T> result = service.saveAll(entities);
        return new ResponseEntity<>(result.stream().map(AbstractEntity::getId).collect(Collectors.toList()), HttpStatus.CREATED);
    }

}
