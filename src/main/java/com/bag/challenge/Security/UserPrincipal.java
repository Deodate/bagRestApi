package com.bag.challenge.security;

import com.bag.challenge.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;
import java.util.Collections;

public class UserPrincipal implements UserDetails {
    private User user;

    public UserPrincipal(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Assuming the User entity has a 'role' attribute
        return Collections.singleton(new SimpleGrantedAuthority(user.getRole()));
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Modify as needed based on your application's logic
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Modify as needed based on your application's logic
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Modify as needed based on your application's logic
    }

    @Override
    public boolean isEnabled() {
        return true; // Modify as needed based on your application's logic
    }
}
