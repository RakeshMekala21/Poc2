package com.demo.example.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data
@Entity
@ToString
@Table(name="student_news")
public class StudentUser {
	@Id
	@GeneratedValue
	private int studentId;
//	private String userName;
	private String studentName;
	private String studentLastName;
//	private String password;
	private int mobileNumber;
	private String email;
//	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//	@JoinTable(name="Student_Project",
//	joinColumns = {
//			@JoinColumn(name= "student_id")
//	},
//	      inverseJoinColumns = {
//	    		  
//	    		  @JoinColumn(name="project_id")
//	      }
//	
//			)
//	private Set<Project> project;


	//	private Project pid;
//	private int pid;
	private String role;
	
	@OneToMany(mappedBy = "studentObject")
//	@JoinTable(name="pid")
    private Set<Project> project;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<Project> getProject() {
		return project;
	}

	public void setProject(Set<Project> project) {
		this.project = project;
	}

	public StudentUser() {
		super();
	}


	

}
