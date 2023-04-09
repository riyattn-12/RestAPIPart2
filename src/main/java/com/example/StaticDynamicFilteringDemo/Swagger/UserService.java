package com.example.StaticDynamicFilteringDemo.Swagger;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService
{
    private static List<User> userList=new ArrayList<>();
    private static int idCount=0;
    static
    {
        userList.add((new User("himani",22,++idCount,"ttn")));
        userList.add(new User("Shreya",21,++idCount,"Shreya@"));
        userList.add(new User("Riya",22,++idCount,"Riya@"));
        userList.add(new User("Harsh",23,++idCount,"Harsh@"));

    }
    public User addNewUser(User user)
    {
        user.setUserId(++idCount);
        userList.add(user);
        return user;

    }
    public List<User> getAllUser()
    {
        return userList;
    }
    public User getUserById(int id)
    {

        return userList.stream().filter(e -> e.getUserId()==id).findFirst().orElse(null);
    }
    public void updateUser(User user,int id) {
        userList = userList.stream().map(emp -> {
            if (emp.getUserId() == id) {
                emp.setName(user.getName());
                emp.setAge(user.getAge());
                emp.setPassword(user.getPassword());
            }
            return emp;
        }).collect(Collectors.toList());
    }

        public void removeUserById(int id)
        {
            userList= userList.stream().filter(emp-> emp.getUserId()!=id).collect(Collectors.toList());

        }

    }

