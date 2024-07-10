package com.ems.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ems.api.entity.BranchEntity;

public interface BranchRepository extends JpaRepository<BranchEntity, Integer> {

	@Query("SELECT b FROM BranchEntity b WHERE b.phone_number = :phone_number")
	Optional<BranchEntity> findByPhone_number(String phone_number);
}
