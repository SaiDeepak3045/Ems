package com.Ems.Role.Service;

import com.Ems.Role.Entity.RoleEntity;
import java.util.List;
import java.util.Optional;

public interface RoleService {

    List<RoleEntity> getAllRoles();

    Optional<RoleEntity> getRoleById(Long roleId);

    Optional<RoleEntity> getByRoleName(String roleName);

    RoleEntity saveRole(RoleEntity role);

    void deleteRole(Long roleId);

    void deleteRole(String roleName);

	void deleteRole(Object roleName);

	List<RoleEntity> getAllRolesBySubDepartmentId(Long id);
	List<RoleEntity> getAllRolesByUserId(String userId);
	List<RoleEntity> getAllRolesByBranchId(Long id);
	List<RoleEntity> getAllRolesByDepartmentId(Long id);
	
}
