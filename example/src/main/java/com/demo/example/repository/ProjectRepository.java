package com.demo.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.example.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
