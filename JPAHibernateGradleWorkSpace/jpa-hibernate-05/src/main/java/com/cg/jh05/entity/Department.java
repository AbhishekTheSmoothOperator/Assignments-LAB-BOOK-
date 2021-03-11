package com.cg.jh05.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departments5")
public class Department {
	@Id
	@Column(name="department_id")
	private Long departmentId;
	@Column(name="dept_name")
	private String departmentName;
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(Long departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return String.format("Departments [departmentId=%s, departmentName=%s]", departmentId, departmentName);
	}

}
