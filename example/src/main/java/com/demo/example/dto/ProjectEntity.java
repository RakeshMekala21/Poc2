package com.demo.example.dto;

public class ProjectEntity {
	private int pid;	
	private String projectName;
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public ProjectEntity() {
		super();
	}

}
