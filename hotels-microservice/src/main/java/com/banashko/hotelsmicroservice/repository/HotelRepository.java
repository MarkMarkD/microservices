package com.banashko.hotelsmicroservice.repository;

import com.banashko.hotelsmicroservice.domain.Hotel;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends AbstractRepository<Hotel, Long>{
}
