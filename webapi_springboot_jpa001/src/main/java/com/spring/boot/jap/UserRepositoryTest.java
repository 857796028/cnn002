package com.spring.boot.jap;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zgc on 11 : 2018/11/13 0013 : 下午 3:32
 */

@RestController
public class UserRepositoryTest
{
     @Autowired
     private  UserRepository userRepository;


    @RequestMapping(value = "/ss")
    public  void testSave(){
        User  u = new User();
        u.setId(100);
        u.setName("chhliu");
        u.setAccount("1000");
        u.setEmai("chliu@com");
        u.setPassword("123456");
        userRepository.save(u);

//         * Hibernate: select user0_.id as id1_1_0_, user0_.account as account2_1_0_, user0_.emai as emai3_1_0_, user0_.name as name4_1_0_, user0_.password as password5_1_0_ from user user0_ where user0_.id=?
//          Hibernate: select next_val as id_val from hibernate_sequence for update
//          Hibernate: update hibernate_sequence set next_val= ? where next_val=?
//          Hibernate: insert into user (account, emai, name, password, id) values (?, ?, ?, ?, ?)

        //sss
    }



}
