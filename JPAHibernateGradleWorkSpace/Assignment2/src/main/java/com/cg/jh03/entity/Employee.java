package com.cg.jh03.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.cg.jh03.model.Account;
import com.cg.jh03.model.Address;

@Entity
@Table(name="employees4")
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="emp_id")
	private Long empId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;   
	@Embedded
	private Address add;
	@Transient
	String fullName=firstName+lastName;
	@Embedded
	private Account acc;
	public Employee() {
		
	}
	public Employee(Long empId, String firstName, String lastName, Address add, Account acc) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.add = add;
		this.acc = acc;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	@Override
	public String toString() {
		return String.format("Employee [empId=%s, firstName=%s, lastName=%s, add=%s, acc=%s]", empId, firstName,
				lastName, add, acc);
	}
	
	
}