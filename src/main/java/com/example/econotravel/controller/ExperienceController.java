package com.example.econotravel.controller;

import com.example.econotravel.model.Experience;
import com.example.econotravel.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExperienceController {
    private final ExperienceRepository experienceRepository;

    @Autowired
//constructor
    public ExperienceController(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }
    @GetMapping("/experiences")
    public List<Experience> allExperiences() {

        return experienceRepository.findAll();
    }}
