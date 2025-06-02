/* 
package codingtechniques.service;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) {
        return new org.springframework.security.core.userdetails.User(
            username,
            "", // пароль не перевіряється
            Collections.singletonList(new SimpleGrantedAuthority("USER"))
        );
    }
}
*/