package com.hemanth.cache.springehcacheproject.repository;


import com.hemanth.cache.springehcacheproject.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByName(String name);

}
