package com.spring.boot.jap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by zgc on 11 : 2018/11/13 0013 : 下午 2:28
 */
public interface PersonRepository extends JpaRepository<Person,Long>
{

     List<Person>  findByAddress(String name);

     Person   findByNameAndAddress(String name,String address);

     @Query("select p from Person p where p.name =:name and p.address =:address")
     Person  withNameAndAddressQuery(@Param("name") String name,@Param("address") String address);

     Person withNameAndAddressNamedQuery(String name,String address);

}
