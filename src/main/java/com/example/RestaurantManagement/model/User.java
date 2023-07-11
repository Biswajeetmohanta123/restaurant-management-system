package com.example.RestaurantManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotBlank
    private String userFirstName;
    @NotBlank
    private String userLastName;
    @Email
    private String userEmail;

    @Size(min = 8, max = 20, message = "Password length must be between 8 and 20 characters")   // The @Pattern annotation specifies that the password must contain at least one digit, one lowercase letter, one uppercase letter, and one special character (i.e., one of @#$%^&+=!).
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).*$", message = "Password must contain at least one digit, one lowercase, one uppercase letter and one special character")
    private String userPassword;
    @Digits(integer = 12,fraction = 0)
    @Size(min = 10, max = 12)
    private String userContactNumber;

    public User(String userFirstName,String userLastName,String userEmail,String userPassword,String userContactNumber){
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userContactNumber = userContactNumber;
    }

}
