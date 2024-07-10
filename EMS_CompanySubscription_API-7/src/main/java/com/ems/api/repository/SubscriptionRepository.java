package com.ems.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.api.entity.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
