package com.example.RestaurantManagement.service;

import com.example.RestaurantManagement.model.AuthenticationToken;
import com.example.RestaurantManagement.model.User;
import com.example.RestaurantManagement.repository.IAuthTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationService {

    @Autowired
    IAuthTokenRepository authTokenRepository;

    public void saveToken(AuthenticationToken token) {
        authTokenRepository.save(token);
    }

    public AuthenticationToken getToken(User user){
        return authTokenRepository.findByUser(user);
    }

    public boolean authenticate(String userEmail, String token) {
        AuthenticationToken authenticationToken = authTokenRepository.findFirstByToken(token);
        Optional<String> expectedMail = Optional.ofNullable(authenticationToken.getUser().getUserEmail());
        if(expectedMail.isPresent()){
            return true;
        }else
            return false;
    }
}
