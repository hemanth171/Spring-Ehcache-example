package com.hemanth.cache.springehcacheproject.resource;

import com.hemanth.cache.springehcacheproject.cache.UsersCache;
import com.hemanth.cache.springehcacheproject.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/user/search")
@RestController
public class UserResource {

    @Autowired
    UsersCache usersCache;

    @GetMapping(path = "{name}")
    public Users getUserDetails(@PathVariable String name) {
        return usersCache.getUser(name);
    }

}
