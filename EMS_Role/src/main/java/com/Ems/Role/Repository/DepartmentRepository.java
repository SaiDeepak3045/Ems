package com.Ems.Role.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ems.Role.Entity.DepartmentEntity;
@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long>{

}
