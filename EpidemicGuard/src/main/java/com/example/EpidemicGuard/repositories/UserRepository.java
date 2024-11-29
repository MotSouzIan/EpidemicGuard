package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {
   UserDetails findByLogin(String login);
}
