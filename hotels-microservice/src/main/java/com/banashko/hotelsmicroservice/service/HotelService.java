package com.banashko.hotelsmicroservice.service;

import com.banashko.hotelsmicroservice.domain.Hotel;
import com.banashko.hotelsmicroservice.repository.AbstractRepository;
import com.banashko.hotelsmicroservice.repository.HotelRepository;
import com.banashko.hotelsmicroservice.specification.AbstractSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HotelService extends AbstractService<Hotel> {

    {
        log = LoggerFactory.getLogger(HotelService.class);
    }

    public HotelService(AbstractRepository<Hotel, Long> repository,
                        AbstractSpecification<Hotel> specification) {
        super(repository, specification);
    }
}
