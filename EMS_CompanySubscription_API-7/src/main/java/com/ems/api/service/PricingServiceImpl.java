package com.ems.api.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.api.entity.Pricing;
import com.ems.api.repository.PricingRepository;

@Service
public class PricingServiceImpl implements PricingService {

    @Autowired
    private PricingRepository pricingRepository;

    @Override
    public Pricing getPricingByPlan(String plan) {
        return pricingRepository.findByPlan(plan);
    }

	@Override
	public List<Pricing> getAllPricing() {
		// TODO Auto-generated method stub
		return pricingRepository.findAll();
	}

	@Override
	public Pricing createPricing(Pricing pricing) {
	    return pricingRepository.save(pricing);
	}


	@Override
	public Pricing getPricingById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pricing updatePricing(Pricing existingPricing) { return pricingRepository.save(existingPricing); }


	@Override
	public void deletePricing(Long id) {
	    // Use the repository to delete pricing information by its ID
	    pricingRepository.deleteById(id);
	}

}

