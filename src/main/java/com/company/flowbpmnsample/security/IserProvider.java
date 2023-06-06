package com.company.flowbpmnsample.security;

import io.jmix.bpm.provider.UserProvider;
import io.jmix.core.security.InMemoryUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@UserProvider
public class IserProvider extends InMemoryUserRepository {

    public IserProvider() {
        super();
    }

    @Override
    protected void initServiceUsers() {
        super.initServiceUsers();
    }

    @Override
    protected UserDetails createSystemUser() {
        return super.createSystemUser();
    }

    @Override
    protected UserDetails createAnonymousUser() {
        return super.createAnonymousUser();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return super.loadUserByUsername(username);
    }

    @Override
    public UserDetails getSystemUser() {
        return super.getSystemUser();
    }

    @Override
    public UserDetails getAnonymousUser() {
        return super.getAnonymousUser();
    }

    @Override
    public List<UserDetails> getByUsernameLike(String substring) {
        return super.getByUsernameLike(substring);
    }

    @Override
    public void addUser(UserDetails user) {
        super.addUser(user);
    }

    @Override
    public void removeUser(UserDetails user) {
        super.removeUser(user);
    }

    @Override
    protected UserDetails copyUserDetails(UserDetails userDetails) {
        return super.copyUserDetails(userDetails);
    }
}
