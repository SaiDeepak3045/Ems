package com.ems.api.repository;



import com.ems.api.entity.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricingRepository extends JpaRepository<Pricing, Long> {
    Pricing findByPlan(String plan);
}
