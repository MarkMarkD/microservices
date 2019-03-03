package com.banashko.hotelsmicroservice.service;

import com.banashko.hotelsmicroservice.domain.TypeOfRoomStatus;
import com.banashko.hotelsmicroservice.repository.AbstractRepository;
import com.banashko.hotelsmicroservice.repository.TypeOfRoomStatusRepository;
import com.banashko.hotelsmicroservice.specification.AbstractSpecification;
import com.banashko.hotelsmicroservice.specification.TypeOfRoomStatusSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TypeOfRoomStatusService extends AbstractService<TypeOfRoomStatus>{
    {
        log = LoggerFactory.getLogger(TypeOfRoomService.class);
    }

    public TypeOfRoomStatusService(AbstractRepository<TypeOfRoomStatus, Long> repository,
                                   AbstractSpecification<TypeOfRoomStatus> specification) {
        super(repository, specification);
    }
}
