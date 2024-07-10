package com.Ems.Role.Service;

import com.Ems.Role.Entity.Branch_entity;
import com.Ems.Role.Entity.CompanyDetails;
import com.Ems.Role.Entity.DepartmentEntity;
import com.Ems.Role.Entity.RoleEntity;
import com.Ems.Role.Entity.SubDepartmentEntity;
import com.Ems.Role.Repository.BranchRepo;
import com.Ems.Role.Repository.CompanyRepo;
import com.Ems.Role.Repository.DepartmentRepository;
import com.Ems.Role.Repository.RoleRepo;
import com.Ems.Role.Repository.SubDepartmentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepo roleRepository;
    
    @Autowired
    private SubDepartmentRepo Subdepartmentrepo;
    @Autowired
    private CompanyRepo companyRepo;
    
@Autowired
    private BranchRepo branchrepo;
@Autowired
private DepartmentRepository departmentRepo;

    @Override
    public List<RoleEntity> getAllRoles() {
        return roleRepository.findAll();
    }
                                     
    @Override
    public Optional<RoleEntity> getRoleById(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public Optional<RoleEntity> getByRoleName(String roleName) {
        return roleRepository.findByRoleName(roleName);
    }
 
    @Override
    public RoleEntity saveRole(RoleEntity role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }

	@Override
	public void deleteRole(Object roleName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRole(String roleName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RoleEntity> getAllRolesByBranchId(Long id) {
		Optional<Branch_entity> byId = branchrepo.findById(id);
		if(byId != null) {
			List<RoleEntity> byBranchBranchId = roleRepository.findByBranchBranchId(id);
			return byBranchBranchId;
		}
		return null;
	}

	@Override
	public List<RoleEntity> getAllRolesByDepartmentId(Long id) {
		Optional<DepartmentEntity> byId = departmentRepo.findById(id);
		if(byId != null) {
			List<RoleEntity> bydepartmentId = roleRepository.findBydepartmentId(id);
			return bydepartmentId;
		}
		return null;
	}

	@Override
	public List<RoleEntity> getAllRolesByUserId(String userId) {
	Optional<CompanyDetails> byId = companyRepo.findById(userId);
	if(byId != null) {
		List<RoleEntity> byCompanyUserId = roleRepository.findByCompanyUserId(userId);
		return byCompanyUserId;
	}
		return null;
	}

	@Override
	public List<RoleEntity> getAllRolesBySubDepartmentId(Long id) {
		Optional<SubDepartmentEntity> byId = Subdepartmentrepo.findById(id);
		if(byId != null) {
			List<RoleEntity> bySubDepartmentId = roleRepository.findBySubDepartmentId(id);
			return bySubDepartmentId;
		}
		return null;
	}
	
	
}
