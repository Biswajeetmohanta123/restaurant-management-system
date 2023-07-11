package com.example.RestaurantManagement.controller;

import com.example.RestaurantManagement.dto.SignInInput;
import com.example.RestaurantManagement.dto.SignInOutput;
import com.example.RestaurantManagement.dto.SignUpInput;
import com.example.RestaurantManagement.dto.SignUpOutput;
import com.example.RestaurantManagement.model.Food;
import com.example.RestaurantManagement.service.AuthenticationService;
import com.example.RestaurantManagement.service.FoodService;
import com.example.RestaurantManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.NoSuchObjectException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private FoodService foodService;

    //signup->signUp input -> signUp output

    @PostMapping("/signup")
    public SignUpOutput signUp(@RequestBody SignUpInput signUpInput) {
        return userService.signUp(signUpInput);
    }

    @PostMapping("/signin")
    public SignInOutput signUp(@RequestBody SignInInput signInInput){
        return userService.signIn(signInInput);
    }

    @GetMapping("/food")
    public ResponseEntity<List<Food>> getAllFoods(@RequestParam String userEmail,@RequestParam String token){
        HttpStatus status;
        List<Food> foodList = null;
        //authenticate

        if(authenticationService.authenticate(userEmail,token)){
            foodList = foodService.showFood();
            status = HttpStatus.FOUND;
        }else{
            status = HttpStatus.FORBIDDEN;
        }
        return new ResponseEntity<List<Food>>(foodList,status);
    }


}


