package com.mouritech.studenthibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private long studentId;
	private String stfirstName;
	private String stlastname;
	private String stcontactNo;
	
	public Student() {
		
		// TODO Auto-generated constructor stub
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStfirstName() {
		return stfirstName;
	}

	public void setStfirstName(String stfirstName) {
		this.stfirstName = stfirstName;
	}

	public String getStlastname() {
		return stlastname;
	}

	public void setStlastname(String stlastname) {
		this.stlastname = stlastname;
	}

	public String getStcontactNo() {
		return stcontactNo;
	}

	public void setStcontactNo(String stcontactNo) {
		this.stcontactNo = stcontactNo;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", stfirstName=" + stfirstName + ", stlastname=" + stlastname
				+ ", stcontactNo=" + stcontactNo + "]";
	}

	public Student(long studentId, String stfirstName, String stlastname, String stcontactNo) {
		super();
		this.studentId = studentId;
		this.stfirstName = stfirstName;
		this.stlastname = stlastname;
		this.stcontactNo = stcontactNo;
	}

	



}
