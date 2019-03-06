package com.banashko.hotelsbookingmicroservice.service;

import com.banashko.hotelsbookingmicroservice.proxy.RoomProxy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeignService {

    private final RoomProxy roomProxy;

    public FeignService(RoomProxy roomProxy) {
        this.roomProxy = roomProxy;
    }

    public void bookRooms(List<Long> ids) {

    }
}
