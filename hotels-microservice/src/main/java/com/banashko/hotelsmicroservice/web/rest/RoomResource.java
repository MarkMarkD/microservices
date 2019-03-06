package com.banashko.hotelsmicroservice.web.rest;

import com.banashko.hotelsmicroservice.domain.Room;
import com.banashko.hotelsmicroservice.service.AbstractService;
import com.banashko.hotelsmicroservice.service.RoomService;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/rooms")
public class RoomResource extends AbstractResource<Room> {
    {
        log = LoggerFactory.getLogger(RoomResource.class);
    }

    public RoomResource(AbstractService<Room> service) {
        super(service, Room.class);
    }

    /**
     * Book several rooms
     *
     * @param roomsIds : list of ids of rooms that need to be booked
     * @return list of rooms that were successfully booked
     */
    @PutMapping(value ="", produces = "application/json; charset=utf-8")
    @Transactional
    public ResponseEntity<List<Long>> bookRooms(@RequestBody List<Long> roomsIds) {
        log.debug("REST request to book room: {}", classType.getSimpleName());

        if (roomsIds.isEmpty())
            return new ResponseEntity("RoomsIds cannot be empty", HttpStatus.BAD_REQUEST);

        List<Long> successfullyBooked = roomsIds.stream()
                .filter(((RoomService)service)::bookRoomById).collect(Collectors.toList());
        return new ResponseEntity(successfullyBooked, HttpStatus.OK);
    }
}
