package com.Springcore;

public class Student {
	private int studId;
	private String studName;
	private String StudAdd;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		System.out.println("seting studid");
		this.studId = studId;
	}
	public String getStudName() {
		
		return studName;
	}
	public void setStudName(String studName) {
		System.out.println("seting studname");
		this.studName = studName;
	}
	public String getStudAdd() {
		return StudAdd;
	}
	public void setStudAdd(String studAdd) {
		System.out.println("seting studid");
		StudAdd = studAdd;
	}
	public Student(int studId, String studName, String studAdd) {
		super();
		this.studId = studId;
		this.studName = studName;
		StudAdd = studAdd;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", StudAdd=" + StudAdd + "]";
	}
	
}
