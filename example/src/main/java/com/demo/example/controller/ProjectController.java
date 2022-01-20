package com.demo.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.entity.Project;
import com.demo.example.service.ProjectService;

@RestController
public class ProjectController {
	@Autowired
	private ProjectService projectService;
@PostMapping("/projects")	
public Project createProject(@RequestBody Project project) {
	
	return  projectService.createProject(project);
}
@GetMapping("/project")
public List<Project> getAll(){
	return projectService.getAll();
}
	
}
