package registerloginApp.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import registerloginApp.model.User;
import registerloginApp.web.dto.UserRegistrationDto;

import java.util.Optional;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

    Optional<User> findByEmail(String s);
}
