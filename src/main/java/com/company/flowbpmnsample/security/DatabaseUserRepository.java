package com.company.flowbpmnsample.security;

import com.company.flowbpmnsample.entity.User;
import io.jmix.bpm.provider.UserGroupListProvider;
import io.jmix.bpm.provider.UserListProvider;
import io.jmix.bpm.provider.UserProvider;
import io.jmix.securitydata.user.AbstractDatabaseUserRepository;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Primary
@UserProvider
@UserListProvider
@UserGroupListProvider
@Component("UserRepository")
public class DatabaseUserRepository extends AbstractDatabaseUserRepository<User> implements JavaDelegate {

    @Override
    protected Class<User> getUserClass() {
        return User.class;
    }

    @Override
    protected void initSystemUser(final User systemUser) {
        final Collection<GrantedAuthority> authorities = getGrantedAuthoritiesBuilder()
                .addResourceRole(FullAccessRole.CODE)
                .build();
        systemUser.setAuthorities(authorities);
    }

    @Override
    protected void initAnonymousUser(final User anonymousUser) {
    }

    @Override
    public void execute(DelegateExecution execution) {

    }
}