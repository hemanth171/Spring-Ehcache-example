package com.hemanth.cache.springehcacheproject.cache;

import com.hemanth.cache.springehcacheproject.model.Users;
import com.hemanth.cache.springehcacheproject.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class UsersCache {

    @Autowired
    UsersRepository usersRepository;

    @Cacheable(value = "usersCache", key = "#name")
    public Users getUser(String name) {
        System.out.println("Data returned from Database: "+ name);
        return usersRepository.findByName(name);
    }

}
