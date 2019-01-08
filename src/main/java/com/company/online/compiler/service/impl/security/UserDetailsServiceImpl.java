package com.company.online.compiler.service.impl.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Security Service. It is used for authentication.
 * Our application uses Spring Security framework and forces us
 * to implement UserDetailsService interface(provided by spring). This interface has
 * only one method - loadUserByUsername(String). In our implementation we should
 * write rules for Spring Security how to authenticate users and what roles they can get.
 * More details you can see on loadUserByUsername implementation.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    /**
     * Implementation of the UserDetailsService interface API.
     * Logic of this method is next:
     * First of all, by userService we try to find any User with such email(method parameter).
     * If service returns null method will throw UsernameNotFoundException which means that
     * entered credentials by guest in not correct and application don't authorize him.
     * If service returns any User object it means that guest guessed email.
     * We put email and real password (service returned User object where we take password) and roles
     * for this User({@link User} and {@link UserRoleEnum}) in provided by Spring User class.
     * Then spring compares data in our returned object (email and real password) with entered data by guest.
     * In case when they are identical(means password, because if exception wasn't thrown, guest typed correct email),
     * Guest session becomes authorized with given roles. Otherwise, attempt considered unsuccessful.
     * @param email - identifier of the user. See description above.
     * @return UserDetails object with correct credentials for comparing and roles which found user has.
     * @throws UsernameNotFoundException in cases when something went wrong. For example, user with such email
     * is not found.
     */
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
