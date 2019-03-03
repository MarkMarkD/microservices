package com.banashko.hotelsmicroservice.web.rest;

import com.banashko.hotelsmicroservice.domain.Room;
import com.banashko.hotelsmicroservice.service.AbstractService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rooms")
public class RoomResource extends AbstractResource<Room> {
    {
        log = LoggerFactory.getLogger(RoomResource.class);
    }

    public RoomResource(AbstractService<Room> service) {
        super(service, Room.class);
    }
}
