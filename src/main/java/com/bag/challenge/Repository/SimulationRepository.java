// src/main/java/com/bag/challenge/repository/SimulationRepository.java
package com.bag.challenge.Repository;

import com.bag.challenge.model.Simulation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SimulationRepository extends JpaRepository<Simulation, Long> {
    List<Simulation> findByUserId(Long userId);
}
