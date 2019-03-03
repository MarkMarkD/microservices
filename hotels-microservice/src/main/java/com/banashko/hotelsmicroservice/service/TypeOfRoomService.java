package com.banashko.hotelsmicroservice.service;

import com.banashko.hotelsmicroservice.domain.TypeOfRoom;
import com.banashko.hotelsmicroservice.repository.AbstractRepository;
import com.banashko.hotelsmicroservice.repository.TypeOfRoomRepository;
import com.banashko.hotelsmicroservice.specification.AbstractSpecification;
import com.banashko.hotelsmicroservice.specification.TypeOfRoomSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TypeOfRoomService extends AbstractService<TypeOfRoom> {
    {
        log = LoggerFactory.getLogger(TypeOfRoomService.class);
    }

    public TypeOfRoomService(AbstractRepository<TypeOfRoom, Long> repository,
                             AbstractSpecification<TypeOfRoom> specification) {
        super(repository, specification);
    }
}
