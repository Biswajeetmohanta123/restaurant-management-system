package com.example.RestaurantManagement.service;

import com.example.RestaurantManagement.model.RestaurantManagement;
import com.example.RestaurantManagement.repository.IRestaurantManagementRepository;
import com.example.RestaurantManagement.repository.IRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantManagementService {

    @Autowired
    IRestaurantManagementRepository iRestaurantManagementRepository;

    @Autowired
    IRestaurantRepository iRestaurantRepository;

    public RestaurantManagement getInformationOfRestaurantByRestaurantEmployeeRecordId(Long restaurantEmployeeRecordId) {
        return iRestaurantManagementRepository.findByRestaurantManagementRecordId(restaurantEmployeeRecordId);
    }

    public RestaurantManagement updateInformationOfRestaurantByRestaurantEmployeeRecordId(Long restaurantEmployeeRecordId) {
        RestaurantManagement restaurantManagement = getInformationOfRestaurantByRestaurantEmployeeRecordId(restaurantEmployeeRecordId);
        if(restaurantManagement.getRestaurantDescription() != null) {
            restaurantManagement.setRestaurantDescription(restaurantManagement.getRestaurantDescription());
        }
        if(restaurantManagement.getRestaurantHeadChefName() != null) {
            restaurantManagement.setRestaurantHeadChefName(restaurantManagement.getRestaurantHeadChefName());
        }
        if(restaurantManagement.getRestaurantHeadChefSalary() != null){
            restaurantManagement.setRestaurantHeadChefSalary(restaurantManagement.getRestaurantHeadChefSalary());
        }
        if(restaurantManagement.getRestaurantStaffsNumber() != 0){
            restaurantManagement.setRestaurantStaffsNumber(restaurantManagement.getRestaurantStaffsNumber());
        }
        if(restaurantManagement.getRestaurantStaffTotalExpense() != 0){
           restaurantManagement.setRestaurantStaffsNumber(restaurantManagement.getRestaurantStaffsNumber());
        }
        return iRestaurantManagementRepository.save(restaurantManagement);
    }
}

