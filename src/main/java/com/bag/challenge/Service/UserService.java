// src/main/java/com/bag/challenge/service/UserService.java
package com.bag.challenge.Service;

import com.bag.challenge.Repository.UserRepository;
import com.bag.challenge.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
