package com.spring.boot.jap;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by zgc on 11 : 2018/11/13 0013 : 下午 3:32
 */
//替代测试类的保存功能
    @Service
@RestController
public class UserRepositoryTest
{
     @Autowired
     private  UserRepository userRepository;


    @RequestMapping(value = "/ss")
    public  String testSave(){
        User  u = new User();
        //u.setId(100);
        u.setName("chhliu");
        u.setAccount("1000");
        u.setEmai("chliu@com");
        u.setPassword("123456");
        userRepository.save(u);

//        * Hibernate: select user0_.id as id1_1_0_, user0_.account as account2_1_0_, user0_.emai as emai3_1_0_, user0_.name as name4_1_0_, user0_.password as password5_1_0_ from user user0_ where user0_.id=?
//          Hibernate: select next_val as id_val from hibernate_sequence for update
//          Hibernate: update hibernate_sequence set next_val= ? where next_val=?
//          Hibernate: insert into user (account, emai, name, password, id) values (?, ?, ?, ?, ?)

        return u.toString();
    }

    //测试批量保存的功能
    @RequestMapping("/batch")
    public String testsav1(){
        List<User> users = new ArrayList<User>();

        User user = new User(  );
        user.setName("tanjie1");
        user.setAccount("1001");
        user.setEmai("tanjie1@com");
        user.setPassword("11");
        users.add(user);//将user保存到list集合中

        User user2 = new User(  );
        user2.setName("tanjie2");
        user2.setAccount("222");
        user2.setEmai("tanjie2@com");
        user2.setPassword("22");
        users.add(user2);//将user保存到list集合中


        User user3 = new User(  );
        user3.setName("tanjie3");
        user3.setAccount("3");
        user3.setEmai("tanjie3@com");
        user3.setPassword("33");
        users.add(user3) ;//将user保存到list集合中

        User user4 = new User(  );
        user4.setName("tanjie444");
        user4.setAccount("444");
        user4.setEmai("tanjie44@com");
        user4.setPassword("44444");
        users.add(user4) ;//将user保存到list集合中



        userRepository.saveAll(users);


        String join = String.join(",", users.toString());
        return join;
    }

    //更新user
    @RequestMapping("/update")
    public String testUpdate(){
        Optional<User> byId = userRepository.findById(1);
        User user = byId.get();
        user.setPassword("SSSSSSS");
        String ss = JSON.toJSONString(user);
        return  ss ;
    }


}
