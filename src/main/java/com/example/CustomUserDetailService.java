package com.example;

import com.example.entity.SecurityUser;
import com.example.entity.User;
import com.example.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByLogin(username);
        if (user == null) {
            throw new UsernameNotFoundException("Пользователь " + username + " не найден!");
        }
        String password = Passwords.getInstance().getPasswords().get(user.id);
        return new SecurityUser(user, password);
    }


}
