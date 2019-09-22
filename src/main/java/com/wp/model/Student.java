package com.wp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int sno;
	private String name;
	private String semester;
	private int marks;
	
	
	public int getsno() {
		return sno;
	}
	public void setsno(int Sno) {
		sno = Sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", semester=" + semester + ", marks=" + marks + "]";
	}
	
	public Student(int sno, String name, String semester, int marks) {
		super();
		this.sno = sno;
		this.name = name;
		this.semester = semester;
		this.marks = marks;
	}
	public Student() {
		super();
	}
	

}
