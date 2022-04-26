package com.homework.springhometask.security.jwt;

import com.homework.springhometask.dto.UserDto;
import com.homework.springhometask.model.Status;
import com.homework.springhometask.model.User;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
public class JwtUser implements UserDetails {

    private final String username;
    private final String password;
    //private final List<SimpleGrantedAuthority> authorities;
    private final Collection<? extends GrantedAuthority> authorities;
    private final boolean isActive;

    public JwtUser(String username, String password, Collection<? extends GrantedAuthority> authorities, boolean isActive) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
        this.isActive = isActive;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isActive;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isActive;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isActive;
    }

    @Override
    public boolean isEnabled() {
        return isActive;
    }

//    public static UserDetails fromUser(UserDto user) {
//        return new org.springframework.security.core.userdetails.User(
//                user.getUsername(), user.getPassword(),
//                user.getStatus().equals(Status.ACTIVE),
//                user.getStatus().equals(Status.ACTIVE),
//                user.getStatus().equals(Status.ACTIVE),
//                user.getStatus().equals(Status.ACTIVE),
//                user.getRoles().getAuthorities()
//        );
//    }
}
