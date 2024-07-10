package com.Ems.Role.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ems.Role.Entity.CompanyDetails;

@Repository
public interface CompanyRepo extends JpaRepository<CompanyDetails, String> {

}
