package com.banashko.hotelsmicroservice.web.rest;

import com.banashko.hotelsmicroservice.domain.Hotel;
import com.banashko.hotelsmicroservice.service.AbstractService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hotels")
public class HotelResource extends AbstractResource<Hotel> {
    {
        log = LoggerFactory.getLogger(HotelResource.class);
    }

    public HotelResource(AbstractService<Hotel> service) {
        super(service, Hotel.class);
    }
}
