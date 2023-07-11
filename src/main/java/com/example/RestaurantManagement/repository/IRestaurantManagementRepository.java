package com.example.RestaurantManagement.repository;

import com.example.RestaurantManagement.model.Restaurant;
import com.example.RestaurantManagement.model.RestaurantManagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantManagementRepository extends JpaRepository<RestaurantManagement,Long> {
    RestaurantManagement findByRestaurant(Restaurant existingRestaurant);

    RestaurantManagement findByRestaurantManagementRecordId(Long restaurantManagementRecordId);
}
