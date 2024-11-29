package com.example.EpidemicGuard.applications;


import com.example.EpidemicGuard.interfaces.UserApplication;
import com.example.EpidemicGuard.entities.User;
import com.example.EpidemicGuard.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserApplicationImpl implements UserApplication {
    private final UserRepository userRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Autowired
    public UserApplicationImpl(UserRepository userRepository
    ) {
        this.userRepository = userRepository;
    }

    public User create(User user) {
        user.findRoles().forEach(r -> {
            r.setUser(user);
        });
        user.setPassword("{bcrypt}" + bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}