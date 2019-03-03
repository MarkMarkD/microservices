package com.banashko.hotelsmicroservice.web.rest;

import com.banashko.hotelsmicroservice.domain.TypeOfRoom;
import com.banashko.hotelsmicroservice.service.AbstractService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/type-of-rooms")
public class TypeOfRoomResource extends AbstractResource<TypeOfRoom> {
    {
        log = LoggerFactory.getLogger(TypeOfRoomResource.class);
    }

    public TypeOfRoomResource(AbstractService<TypeOfRoom> service) {
        super(service, TypeOfRoom.class);
    }
}
