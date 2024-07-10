package com.ems.api.service;

import java.util.List;

import com.ems.api.entity.Pricing;

public interface PricingService {
    Pricing getPricingByPlan(String plan);

	List<Pricing> getAllPricing();

	Pricing createPricing(Pricing pricing);


	Pricing getPricingById(Long id);

	Pricing updatePricing(Pricing existingPricing);



	void deletePricing(Long id);
}
