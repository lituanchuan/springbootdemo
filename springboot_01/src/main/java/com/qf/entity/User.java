package com.qf.entity;


import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component//同@controller,@service
@ConfigurationProperties(prefix = "user")
public class User {
    public  int id;
    public  String name;
    public   int age;
    public String[] loves;
    public List<String> email;
    public Map<String,String> map;

    public User(int id, String name, int age, String[] loves, List<String> email, Map<String, String> map) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.loves = loves;
        this.email = email;
        this.map = map;
    }

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}
