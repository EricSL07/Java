package com.portfolio.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {
    
    @GetMapping
    public List<ExerciseDTO> getExercises() {
        return List.of(
            new ExerciseDTO(1L, "Pull-up", "Back"),
            new ExerciseDTO(2L, "L-sit", "Core"),
            new ExerciseDTO(3L, "Push-up", "Chest")
        );
    }
}