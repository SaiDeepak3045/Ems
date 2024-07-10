package com.ems.api.service;

import java.util.List;

import com.ems.api.entity.Subscription;

public interface SubscriptionService {
    List<Subscription> getAllSubscriptions();
    Subscription getSubscriptionById(Long id);
    Subscription createSubscription(Subscription subscription);
    void deleteSubscription(Long id);
	List<Subscription> getSubscriptionsByUserId(String userId);
}

