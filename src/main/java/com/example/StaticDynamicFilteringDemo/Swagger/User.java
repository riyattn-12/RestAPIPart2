package com.example.StaticDynamicFilteringDemo.Swagger;

import org.springframework.stereotype.Component;

@Component

public class User
{
    private int userId;

    private String password;

    private int age;

    private String name;

    User()
    {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, int age, int userId,String password) {
        this.name = name;
        this.age = age;
        this.userId = userId;
        this.password=password;
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


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

