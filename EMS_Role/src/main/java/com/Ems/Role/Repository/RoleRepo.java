package com.Ems.Role.Repository;


import com.Ems.Role.Entity.RoleEntity;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<RoleEntity, Long> {

    Optional<RoleEntity> findByRoleName(String roleName);

    public List<RoleEntity> findByBranchBranchId(Long id);

    public List<RoleEntity> findBydepartmentId(Long id);

    public List<RoleEntity> findByCompanyUserId(String userId);

	public List<RoleEntity> findBySubDepartmentId(Long id);

	
}
