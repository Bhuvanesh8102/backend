package com.klu.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_s5")
public class Student 
{
	@Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)	//to generate the student id automatically
	@Column(name="student_id")//there are three variables so we have to take 3 columns
	Long sid;
	@Column(name="student_name")
	String sname;
	@Column(name="Student_dept")
	String sdept;
	public Long getSid() 
	{
		return sid;
	}
	public void setSid(Long sid) 
	{
		this.sid = sid;
	}
	public String getSname() 
	{
		return sname;
	}
	public void setSname(String sname)
	{
		this.sname = sname;
	}
	public String getSdept() 
	{
		return sdept;
	}
	public void setSdept(String sdept)
	{
		this.sdept = sdept;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sdept=" + sdept + "]";
	}
	
	
	

}
