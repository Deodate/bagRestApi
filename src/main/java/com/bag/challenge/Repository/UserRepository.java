// src/main/java/com/bag/challenge/repository/UserRepository.java
package com.bag.challenge.Repository;

import com.bag.challenge.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
