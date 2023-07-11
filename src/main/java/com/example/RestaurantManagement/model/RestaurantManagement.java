package com.example.RestaurantManagement.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "restaurantManagementRecordId",scope = RestaurantManagement.class)
public class RestaurantManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restaurantManagementRecordId;
    @NotBlank
    private String restaurantDescription;

    @NotBlank
    private String restaurantHeadChefName;

    @NotNull
    private Integer restaurantHeadChefSalary;

    @NotNull
    private int restaurantStaffsNumber;

    @NotNull
    private Long restaurantStaffTotalExpense;

    @OneToOne
    private Restaurant restaurant;
}
