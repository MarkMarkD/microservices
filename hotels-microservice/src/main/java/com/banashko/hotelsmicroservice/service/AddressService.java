package com.banashko.hotelsmicroservice.service;

import com.banashko.hotelsmicroservice.domain.Address;
import com.banashko.hotelsmicroservice.repository.AbstractRepository;
import com.banashko.hotelsmicroservice.repository.AddressRepository;
import com.banashko.hotelsmicroservice.specification.AbstractSpecification;
import com.banashko.hotelsmicroservice.specification.AddressSpecification;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends AbstractService<Address>{

    {
        log = LoggerFactory.getLogger(AddressService.class);
    }

    public AddressService(AbstractRepository<Address, Long> repository,
                          AbstractSpecification<Address> specification) {
        super(repository, specification);
    }


}
