// src/main/java/com/bag/challenge/service/SimulationService.java
package com.bag.challenge.Service;

import com.bag.challenge.Repository.SimulationRepository;
import com.bag.challenge.model.Simulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimulationService {
    @Autowired
    private SimulationRepository simulationRepository;

    public Simulation saveSimulation(Simulation simulation) {
        return simulationRepository.save(simulation);
    }

    public List<Simulation> findSimulationsByUserId(Long userId) {
        return simulationRepository.findByUserId(userId);
    }
}
