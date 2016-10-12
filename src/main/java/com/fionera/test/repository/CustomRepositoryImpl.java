package com.fionera.test.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.io.Serializable;

import javax.persistence.EntityManager;

/**
 * Created by fionera on 16-10-11.
 */
public class CustomRepositoryImpl<T, ID extends Serializable>
        extends SimpleJpaRepository<T, ID>
        implements CustomRepository<T, ID> {

    private EntityManager entityManager;

    public CustomRepositoryImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
        this.entityManager = em;
    }

    @Override
    public Page<T> findByAuto(T example, Pageable pageable) {
        return findAll(CustomSpecs.byAuto(entityManager, example), pageable);
    }
}
