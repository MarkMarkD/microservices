package com.banashko.hotelsmicroservice.web.rest;

import com.banashko.hotelsmicroservice.domain.TypeOfRoomStatus;
import com.banashko.hotelsmicroservice.service.AbstractService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/type-of-room-statuses")
public class TypeOfRoomStatusResource extends AbstractResource<TypeOfRoomStatus> {
    {
        log = LoggerFactory.getLogger(TypeOfRoomStatusResource.class);
    }

    public TypeOfRoomStatusResource(AbstractService<TypeOfRoomStatus> service) {
        super(service, TypeOfRoomStatus.class);
    }
}
