package com.demo.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.dto.StudentUserEntity;
import com.demo.example.entity.StudentUser;
import com.demo.example.service.SudentService;
@RestController
public class StudentController {
	@Autowired
	 private SudentService sudentService;
	
		/*
		 * @PutMapping("/studentusers/{studentId}") public StudentUser
		 * insertUser(@RequestBody StudentUser studentUser , @PathVariable("studentId")
		 * Integer studentID) {
		 * 
		 * return sudentService.insertUser(studentUser, studentID); }
		 */
	@PostMapping("/students")
	public StudentUser  createUser(@RequestBody StudentUser studentUser) {
	
	  return sudentService.createUser(studentUser);
	}
	
	@GetMapping("/studentusers")
	public List<StudentUser> getAll( ){
		
		return sudentService.getAll();
	}
	
	@GetMapping("/studentusers/{studentId}")
	public Optional<StudentUser> findStudenUsertById(@PathVariable("studentId")  Integer studentId) {
		
		return sudentService.findStudenUsertById(studentId);
	}


}
