package com.banashko.hotelsmicroservice.repository;

import com.banashko.hotelsmicroservice.domain.Address;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends AbstractRepository<Address, Long> {
}
