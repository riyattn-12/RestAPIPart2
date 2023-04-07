package com.example.StaticDynamicFilteringDemo.StaticFiltering;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService
{
    private static List<User> userList=new ArrayList<>();
    private static int idCount=0;
    static
    {
        userList.add(new User(1,"riya","ttn"));
        userList.add(new User(2,"shreya","ttn1"));
        userList.add(new User(3,"supriya","ttn2"));
        userList.add(new User(4,"shobit","ttn3"));
        userList.add(new User(5,"himani","ttn4"));

    }


    public List<User> findAll()
    {
        return userList;
    }
}
