package com.banashko.hotelsmicroservice.web.rest;

import com.banashko.hotelsmicroservice.domain.Address;
import com.banashko.hotelsmicroservice.service.AbstractService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/addresses")
public class AddressResource extends AbstractResource<Address> {
    {
        log = LoggerFactory.getLogger(AddressResource.class);
    }

    public AddressResource(AbstractService<Address> service) {
        super(service, Address.class);
    }
}
