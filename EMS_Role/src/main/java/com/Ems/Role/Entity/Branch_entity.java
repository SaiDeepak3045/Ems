package com.Ems.Role.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="Branch_Details")
public class Branch_entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long branchId;
	private String branchName;


		public Long getId() {
			return branchId;
		}

	public void setId(Long id) {
		this.branchId = id;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	

	
	public Branch_entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
}
