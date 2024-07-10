package com.Ems.Role.Entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "role_entity")
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    private String roleName;
    
    
	 @ManyToOne
	 @JoinColumn(name="department_id")
	 private DepartmentEntity department;
	 
	 @ManyToOne
	 @JoinColumn(name="branchId")
		private Branch_entity branch;
	 
	 @ManyToOne
		@JoinColumn(name="userId")
		private CompanyDetails company;
	 
	 
	 @ManyToOne
		@JoinColumn(name="subDepartment_id")
		private SubDepartmentEntity subDepartment;
	 

	


	public RoleEntity() {
       
    }
	





	public Long getRoleId() {
		return roleId;
	}






	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}






	public String getRoleName() {
		return roleName;
	}






	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}






	public DepartmentEntity getDepartment() {
		return department;
	}






	public void setDepartment(DepartmentEntity department) {
		this.department = department;
	}






	public Branch_entity getBranch() {
		return branch;
	}






	public void setBranch(Branch_entity branch) {
		this.branch = branch;
	}






	public CompanyDetails getCompany() {
		return company;
	}






	public void setCompany(CompanyDetails company) {
		this.company = company;
	}






	public SubDepartmentEntity getSubDepartment() {
		return subDepartment;
	}






	public void setSubDepartment(SubDepartmentEntity subDepartment) {
		this.subDepartment = subDepartment;
	}






	public RoleEntity(Long roleId, String roleName, com.Ems.Role.Entity.DepartmentEntity department,
			com.Ems.Role.Entity.Branch_entity branch, com.Ems.Role.Entity.CompanyDetails company,
			SubDepartmentEntity subDepartment) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.department = department;
		this.branch = branch;
		this.company = company;
		this.subDepartment = subDepartment;
	}
	
    
   
    
    
}
