package com.example.myphotoapp.repository;

import com.example.myphotoapp.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository
{
    public User getUser()
    {
        User user = new User("keval","tbay",26);
        return user;
    }
}
