  package com.Ems.Role.Controller;

import com.Ems.Role.Entity.RoleEntity;
import com.Ems.Role.Service.RoleService;
import com.anarghya.api.entity.DepartmentEntity;
import com.anarghya.api.entity.SubDepartmentEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    
    @GetMapping("/getAll")
    public ResponseEntity<List<RoleEntity>> getAllRoles() {
        List<RoleEntity> roles = roleService.getAllRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    
    @GetMapping("/id/{roleId}")
    public ResponseEntity<RoleEntity> getRoleById(@PathVariable Long roleId) {
        Optional<RoleEntity> role = roleService.getRoleById(roleId);
        return role.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                   .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    
    @GetMapping("/byname/{roleName}")
    public ResponseEntity<RoleEntity> getByRoleName(@PathVariable String roleName) {
        Optional<RoleEntity> role = roleService.getByRoleName(roleName);
        return role.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                   .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

   
    @PostMapping("/create")
    public ResponseEntity<RoleEntity> createRole(@RequestBody RoleEntity role) {
        RoleEntity savedRole = roleService.saveRole(role);
        return new ResponseEntity<>(savedRole, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<RoleEntity> updateRoleById(@PathVariable Long id, @RequestBody RoleEntity updatedRole) {
        try {
            Optional<RoleEntity> existingRoleOptional = roleService.getRoleById(id);
            if (existingRoleOptional.isPresent()) {
                RoleEntity existingRole = existingRoleOptional.get();                
                existingRole.setRoleName(updatedRole.getRoleName()); 
               RoleEntity savedRole = roleService.saveRole(existingRole);
                return new ResponseEntity<>(savedRole, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


   
    @PutMapping("/update/byname/{roleName}")
    public ResponseEntity<RoleEntity> updateByRoleName(@PathVariable String roleName, @RequestBody RoleEntity updatedRole) {
        Optional<RoleEntity> existingRole = roleService.getByRoleName(roleName);
        if (existingRole.isPresent()) {
            RoleEntity roleToUpdate = existingRole.get();
            roleToUpdate.setRoleName(updatedRole.getRoleName());
            RoleEntity savedRole = roleService.saveRole(roleToUpdate);
            return new ResponseEntity<>(savedRole, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

   
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteRoleById(@PathVariable Long id) {
        if (roleService.getRoleById(id).isPresent()) {
            roleService.deleteRole(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
    @DeleteMapping("/delete/byname/{roleName}")
    public ResponseEntity<Void> deleteRoleByName(@PathVariable String roleName) {
        Optional<RoleEntity> existingRole = roleService.getByRoleName(roleName);
        if (existingRole.isPresent()) {
            roleService.deleteRole(existingRole.get().getRoleName());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/branch/{branchId}")
    public ResponseEntity<List<RoleEntity>> getAllRolesByBranchId(@PathVariable Long id) {
    	List<RoleEntity> allRolesByBranchId = roleService.getAllRolesByBranchId(id);
		return new ResponseEntity<> (allRolesByBranchId,HttpStatus.OK);
    	
    }
    @GetMapping("/department/{id}")	
    public ResponseEntity<List<RoleEntity>> getAllRolesByDepartmentId(@PathVariable Long id){
    	List<RoleEntity> allRolesByDepartmentId = roleService.getAllRolesByDepartmentId(id);
		return new ResponseEntity<> (allRolesByDepartmentId,HttpStatus.OK);
    	
    }
    @GetMapping("/getRole/{userId}")
	public ResponseEntity<List<RoleEntity>> getAllRolesByUserId(@PathVariable String userId) {
		List<RoleEntity> allRolesByUserId = roleService.getAllRolesByUserId(userId);
		return new ResponseEntity<>(allRolesByUserId,HttpStatus.OK);
		
	}
    @GetMapping("/subdepartment/{id}")
	public ResponseEntity<List<RoleEntity>> getAllRolesBySubDepartmentId(@PathVariable Long id) {
		List<RoleEntity> allRolesBySubDepartmentId = roleService.getAllRolesBySubDepartmentId(id);
		return new ResponseEntity<>(allRolesBySubDepartmentId,HttpStatus.OK);
		
		
	}
   
}
