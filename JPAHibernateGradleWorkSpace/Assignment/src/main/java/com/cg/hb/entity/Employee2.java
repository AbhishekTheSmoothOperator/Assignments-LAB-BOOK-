package com.cg.hb.entity;
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cg.hb.model.Address;
@Entity
@Table(name="employees2")
public class Employee2 implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@Column(name="emp_id")
	private Long empID;
	@Column(name="emp_name")
	private String empName;
	@Column(name="salary")
	private Double salary;
	
	@Column(name="doj")
	private LocalDate dateJoined;
	@Embedded
	private Address address;
	
	
	public Employee2() {
		
	}
	public Employee2(Long empID, String empName, Double salary, 	LocalDate dateJoined, Address address) {
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		this.dateJoined=dateJoined;
		this.address=address;
	}
	public Long getEmpID() {
		return empID;
	}
	public void setEmpID(Long empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public LocalDate getDateJoined() {
		return dateJoined;
	}
	public void setDateJoined(LocalDate dateJoined) {
		this.dateJoined = dateJoined;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return String.format("Employee2 [empID=%s, empName=%s, salary=%s, dateJoined=%s, address=%s]", empID, empName,
				salary, dateJoined, address);
	}
	
	
	

}