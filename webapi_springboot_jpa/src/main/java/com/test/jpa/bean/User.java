package com.test.jpa.bean;

import javax.persistence.*;

/**
 * Created by zgc on 11 : 2018/11/16 0016 : 下午 3:53
 */
@Entity
@Table(name = "t_user2") //默认是user
public class User {

    @Column(name = "last_name" ,length = 50)
    private String lastName;
    @Column //默认省略
    private String email;

    @Id //表示这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
