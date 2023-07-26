package com.mpp.mapageperso.controllers;

import com.mpp.mapageperso.models.Project;
import com.mpp.mapageperso.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("")
    public List<Project> getProjects() {
        return projectRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
    }

}
