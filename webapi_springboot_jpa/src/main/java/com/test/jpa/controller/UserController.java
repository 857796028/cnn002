package com.test.jpa.controller;

import com.test.jpa.bean.User;
import com.test.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by zgc on 11 : 2018/11/16 0016 : 下午 4:07
 */
@RestController

public class UserController {
@Autowired
    UserRepository userRepository;

@GetMapping("/user/{id}")
public User getUser(@PathVariable("id")Integer id){
    Optional<User> users = userRepository.findById(id);
    User user = users.get();
    return user;
   }
   @GetMapping("/user")
   public User insertUser(User user){
       User save = userRepository.save(user);
        return save; //返回的带自增主键
   }

}
