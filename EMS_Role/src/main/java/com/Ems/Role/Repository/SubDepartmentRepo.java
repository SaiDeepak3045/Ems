package com.Ems.Role.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ems.Role.Entity.SubDepartmentEntity;


@Repository
public interface SubDepartmentRepo extends JpaRepository<SubDepartmentEntity, Long> {

}
