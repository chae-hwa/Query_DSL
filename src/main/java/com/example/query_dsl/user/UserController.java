package com.example.query_dsl.user;

import com.example.query_dsl.user.entity.SiteUser;
import com.example.query_dsl.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @RequestMapping("user/{id}")
    public SiteUser user(@PathVariable("id") Long id){
        return userRepository.getQslUser(id);
    }
}
