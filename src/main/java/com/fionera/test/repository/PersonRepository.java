package com.fionera.test.repository;

import com.fionera.test.model.Person;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by fionera on 16-10-10.
 */
public interface PersonRepository extends CustomRepository<Person,Long>{

    List<Person> findByAddress(String address);

    List<Person> findByNameAndAddress(String name,String address);

    @Query("select p from Person p where p.name= :name and p.address= :address")
    Person withNameAndAddressQuery(@Param("name")String name,@Param("address")String address);

    List<Person> withNameAndAddressNameQuery(String name,String address);
}
