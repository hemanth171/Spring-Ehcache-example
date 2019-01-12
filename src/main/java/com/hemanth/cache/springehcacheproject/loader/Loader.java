package com.hemanth.cache.springehcacheproject.loader;

import com.hemanth.cache.springehcacheproject.model.Users;
import com.hemanth.cache.springehcacheproject.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Loader {

    @Autowired
    UsersRepository usersRepository;

    @PostConstruct
    public void load() {
        usersRepository.save(new Users("hemanth",10000L, "chennai"));
        usersRepository.save(new Users("lidiyal",24000L, "banglore"));
        usersRepository.save(new Users("pinky",4000L, "mumbai"));
    }
}
