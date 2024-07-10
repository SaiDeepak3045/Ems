package com.Ems.Role.Entity;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="subdepartment")
public class SubDepartmentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 private String subDepartmentName;
	 
	
	 
	public SubDepartmentEntity() {
		 
	 }



	public SubDepartmentEntity(Long id, String subDepartmentName) {
		super();
		this.id = id;
		this.subDepartmentName = subDepartmentName;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getSubDepartmentName() {
		return subDepartmentName;
	}



	public void setSubDepartmentName(String subDepartmentName) {
		this.subDepartmentName = subDepartmentName;
	}
	 
	
	

}
