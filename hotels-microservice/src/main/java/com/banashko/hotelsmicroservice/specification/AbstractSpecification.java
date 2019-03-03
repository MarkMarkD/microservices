package com.banashko.hotelsmicroservice.specification;

import org.springframework.data.jpa.domain.Specification;

public abstract class AbstractSpecification<T> {

    public Specification<T> byId(Long id) {
        return ((root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("id"), id));
    }

    public Specification<T> equalSpecification(String field, Object value) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get(field), value);
    }


}
