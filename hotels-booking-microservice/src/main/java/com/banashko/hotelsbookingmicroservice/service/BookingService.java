package com.banashko.hotelsbookingmicroservice.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final FeignService feignService;

    public BookingService(FeignService feignService) {
        this.feignService = feignService;
    }

}
