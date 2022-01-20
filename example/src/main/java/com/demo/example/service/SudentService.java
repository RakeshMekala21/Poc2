package com.demo.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.example.dto.StudentUserEntity;
import com.demo.example.entity.Project;
import com.demo.example.entity.StudentUser;
import com.demo.example.repository.StudentUserRepository;


@Service
public class SudentService {
	@Autowired
	private StudentUserRepository studentUserRepository;
	
	/*
	 * public StudentUser insertUser( StudentUser studentUser , Integer studentID) {
	 * 
	 * StudentUser studentUserDb =studentUserRepository.findById(studentID).get();
	 * 
	 * return studentUserRepository.save(studentUserDb); }
	 */
	
	
	/*
	 * public StudentUser createUser(StudentUserEntity studentUser) {
	 * 
	 * StudentUser entity = new StudentUser();
	 * entity.setEmail(studentUser.getEmail());
	 * entity.setStudentName(studentUser.getStudentName());
	 * entity.setRole(studentUser.getRole());
	 * entity.setStudentLastName(studentUser.getStudentLastName());
	 * entity.setMobileNumber(studentUser.getMobileNumber());
	 * entity.setStudentId(studentUser.getStudentId());
	 * 
	 * return studentUserRepository.save(entity); }
	 */
	
	
	public StudentUser createUser( StudentUser studentUser) {
		return studentUserRepository.save(studentUser);
	}
	
//	public void initStudentAndRole(){
//		Project projectRole = new Project();
//		projectRole.setPid(10);
//		projectRole.setDuration(5);
//		projectRole.setProjectName("JAVA");
//		studentUserRepository.save(projectRole);
//	}
	public List<StudentUser> getAll(){
		
		return studentUserRepository.findAll();
	} 
	
	

	
	public Optional<StudentUser> findStudenUsertById(Integer studentId) {
		return studentUserRepository.findById(studentId);
	}
 }
