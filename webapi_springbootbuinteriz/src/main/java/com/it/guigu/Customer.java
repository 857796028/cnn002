package com.it.guigu;

/**
 * Created by zgc on 11 : 2018/11/10 0010 : 下午 2:33
 */
public class Customer {

    private String name;
    private String age;
    private String sex;
    private String tel;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public Customer() {


    }

    public Customer(String name, String age, String sex, String tel) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.tel = tel;
    }
}
