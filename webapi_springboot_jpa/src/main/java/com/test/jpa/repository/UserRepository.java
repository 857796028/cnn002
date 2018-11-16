package com.test.jpa.repository;

import com.test.jpa.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zgc on 11 : 2018/11/16 0016 : 下午 3:57
 */
public interface UserRepository extends JpaRepository<User,Integer>{
}
