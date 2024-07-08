// src/main/java/com/bag/challenge/controller/SimulationController.java
package com.bag.challenge.Controller;

import com.bag.challenge.Service.SimulationService;
import com.bag.challenge.model.Simulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/simulations")
public class SimulationController {
    @Autowired
    private SimulationService simulationService;

    // Endpoint to fetch simulations by user ID
    @GetMapping
    public ResponseEntity<List<Simulation>> getSimulationsByUser(@RequestParam Long userId) {
        List<Simulation> simulations = simulationService.findSimulationsByUserId(userId);
        return ResponseEntity.ok(simulations);
    }

    // Endpoint to create a new simulation
    @PostMapping
    public ResponseEntity<Simulation> createSimulation(@RequestBody Simulation simulation) {
        Simulation savedSimulation = simulationService.saveSimulation(simulation);
        return ResponseEntity.ok(savedSimulation);
    }
}
