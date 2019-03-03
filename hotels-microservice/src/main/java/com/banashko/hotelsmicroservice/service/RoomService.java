package com.banashko.hotelsmicroservice.service;

import com.banashko.hotelsmicroservice.domain.Room;
import com.banashko.hotelsmicroservice.repository.AbstractRepository;
import com.banashko.hotelsmicroservice.repository.RoomRepository;
import com.banashko.hotelsmicroservice.specification.AbstractSpecification;
import com.banashko.hotelsmicroservice.specification.RoomSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RoomService extends AbstractService<Room>{

    {
        log = LoggerFactory.getLogger(RoomService.class);
    }

    public RoomService(AbstractRepository<Room, Long> repository,
                       AbstractSpecification<Room> specification) {
        super(repository, specification);
    }
}
