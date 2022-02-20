package com.java.registrationloginsb.service;

import com.java.registrationloginsb.model.User;
import com.java.registrationloginsb.webdto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);

}
