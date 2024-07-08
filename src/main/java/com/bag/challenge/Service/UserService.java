// src/main/java/com/bag/challenge/service/UserService.java
package com.bag.challenge.Service;

import com.bag.challenge.Repository.UserRepository;
import com.bag.challenge.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User updateUser(Long userId, User newUser) {
        return userRepository.findById(userId)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    user.setEmail(newUser.getEmail());
                    // Update other fields as needed
                    return userRepository.save(user);
                })
                .orElse(null);
    }

    public boolean deleteUser(Long userId) {
        try {
            userRepository.deleteById(userId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}