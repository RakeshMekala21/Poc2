package com.demo.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.example.entity.StudentUser;

@Repository
public interface StudentUserRepository extends JpaRepository<StudentUser, Integer> {

}
