package com.spring.boot.jap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zgc on 11 : 2018/11/13 0013 : 下午 3:28
 */
@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue
    private Integer id;// id值
    private  String account ;//账号
    private  String name;
    private  String password;
    private  String emai;

    //空参 和全参构造 函数


    public User(String account, String name, String password, String emai) {
        this.account = account;
        this.name = name;
        this.password = password;
        this.emai = emai;
    }

    public User() {
    }
    //get&set方法

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }
}
