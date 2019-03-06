package com.banashko.hotelsbookingmicroservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "HotelsMicroservice")
public interface RoomProxy {

    @PutMapping("/api/rooms/")
    public ResponseEntity<List<Long>> bookRooms(@RequestBody List<Long> roomsIds);

}
