package com.spring.boot.jap;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by zgc on 11 : 2018/11/13 0013 : 下午 3:31
 */

public interface UserRepository extends CrudRepository<User,Integer> {

}
