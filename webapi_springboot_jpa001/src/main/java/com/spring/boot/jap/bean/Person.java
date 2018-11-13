package com.spring.boot.jap.bean;

import sun.util.calendar.BaseCalendar;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;

/**
 * Created by zgc on 11 : 2018/11/13 0013 : 下午 4:50
 */
public class Person {
    private String name;
    private Integer age;
    private boolean boss;

    private java.util.Date bithday;
    private Map<String,Object>  maps;
    private List<Object> list;
    private Dog dog;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBithday() {
        return bithday;
    }

    public void setBithday(Date bithday) {
        this.bithday = bithday;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", bithday=" + bithday +
                ", maps=" + maps +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
