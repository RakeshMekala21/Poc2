package com.demo.example.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Data
//@NoArgsConstructor
//@Getter
//@Setter
@Table(name="project_news")

public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;	
	private String projectName;
	@ManyToOne
	private StudentUser studentObject;
	
	
	private int duration;


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public StudentUser getStudentObject() {
		return studentObject;
	}


	public void setStudentObject(StudentUser studentObject) {
		this.studentObject = studentObject;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
//	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//	@JoinColumn(name="studentID")
//	private StudentUser studentId;
	

}
