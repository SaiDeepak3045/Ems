package com.ems.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ems.api.entity.Pricing;
import com.ems.api.entity.Subscription;
import com.ems.api.service.PricingService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController 
@RequestMapping("/pricing")
public class PricingController {
    @Autowired
    private PricingService pricingService;

    @GetMapping("/get")
    public List<Pricing> getAllPricing() {
        return pricingService.getAllPricing();
    }  

    @PostMapping
    public ResponseEntity<Pricing> createPricing(@RequestBody Pricing pricing) {
        Pricing createdPricing = pricingService.createPricing(pricing);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPricing);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pricing> updatePricing(@PathVariable Long id, @RequestBody Pricing pricing) {
        Pricing existingPricing = pricingService.getPricingById(id);
        if (existingPricing != null) {
            
            existingPricing.setPlan(pricing.getPlan());
            existingPricing.setPrice(pricing.getPrice());
            existingPricing.setDiscount(pricing.getDiscount());

            Pricing updatedPricing = pricingService.updatePricing(existingPricing);
            return ResponseEntity.ok(updatedPricing);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePricing(@PathVariable Long id) {
        pricingService.deletePricing(id);
        return ResponseEntity.noContent().build();
    }
   
    @GetMapping("/pricing/{plan}")
    public ResponseEntity<Pricing> getPricingByPlan(@PathVariable String plan) {
        try {
            // Fetch pricing information based on the provided plan
            Pricing pricing = pricingService.getPricingByPlan(plan);

            // Check if pricing information exists for the provided plan
            if (pricing != null) {
                // Return the pricing information with a 200 OK status
                return ResponseEntity.ok(pricing);
            } else {
                // If pricing information does not exist for the provided plan, return a 404 Not Found status
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            // If there's an error in processing the request, return a 500 Internal Server Error status
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
  
}



