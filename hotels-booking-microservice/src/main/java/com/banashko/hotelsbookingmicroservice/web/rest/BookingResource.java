package com.banashko.hotelsbookingmicroservice.web.rest;

import com.banashko.hotelsbookingmicroservice.proxy.RoomProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/booking")
public class BookingResource {

    private final Logger log = LoggerFactory.getLogger(BookingResource.class);
    private final RoomProxy roomProxy;

    public BookingResource(RoomProxy roomProxy) {
        this.roomProxy = roomProxy;
    }

    @PutMapping("")
    public ResponseEntity bookRooms(@RequestBody List<Long> roomsIds) {
        log.debug("REST request to book rooms by id: {}", roomsIds);
        return roomProxy.bookRooms(roomsIds);
    }
}
