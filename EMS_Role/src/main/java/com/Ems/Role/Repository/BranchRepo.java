package com.Ems.Role.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ems.Role.Entity.Branch_entity;

@Repository
public interface BranchRepo  extends JpaRepository<Branch_entity, Long>{

}
