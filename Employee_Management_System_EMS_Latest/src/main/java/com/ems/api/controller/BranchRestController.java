package com.ems.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.api.dto.BranchForm;
import com.ems.api.entity.BranchEntity;
import com.ems.api.service.BranchService;

@CrossOrigin("*")
@RestController
public class BranchRestController {
	
	@Autowired
	private BranchService branchService;
	
	@PostMapping("/save/{organizationId}")
	public ResponseEntity<String> saveBranch(@PathVariable Integer organizationId, @RequestBody BranchForm form) {
		String response = branchService.saveBranch(organizationId, form);
		if (response.equals("Branch saved successfully")) {
			return new  ResponseEntity<String>(response,HttpStatus.OK);
		} else {
			return new  ResponseEntity<String>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

    @GetMapping("/all")
    public ResponseEntity<List<BranchForm>> getAllBranches() {
        List<BranchForm> branches = branchService.getAllBranches();
        return ResponseEntity.ok(branches);
    }
    
    
	
	   @PutMapping("/branchupdate/{id}")
	    public ResponseEntity<BranchEntity> updateBranch(@PathVariable Integer id, @RequestBody BranchEntity branchDetails) throws Exception {
	        BranchEntity updatedBranch = branchService.updateBranch(id, branchDetails);
	        return ResponseEntity.ok(updatedBranch);
	    }
	   
	   
	   
	   @GetMapping("/get/{id}")
	    public ResponseEntity<BranchForm> getBranchById(@PathVariable Integer id) {
		   BranchForm branch = branchService.getBranchById(id);
	        if (branch != null) {
	            return ResponseEntity.ok(branch);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
}