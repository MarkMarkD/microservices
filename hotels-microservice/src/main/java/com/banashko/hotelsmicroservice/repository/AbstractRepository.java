package com.banashko.hotelsmicroservice.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@NoRepositoryBean
public interface AbstractRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

    Set<T> findAll(Specification<T> specification);

    T findOne(Specification<T> specification);

    void deleteById(Long id);

}
