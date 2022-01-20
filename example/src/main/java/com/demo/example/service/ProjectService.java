package com.demo.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.example.dto.ProjectEntity;
import com.demo.example.entity.Project;
import com.demo.example.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	public Project createProject(   Project project) {
		
		return projectRepository.save(project);
	}
	public List<Project> getAll(){
		
		return projectRepository.findAll();
	}

}
