package com.example.query_dsl;

import com.example.query_dsl.user.entity.SiteUser;
import com.example.query_dsl.user.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("회원 생성")
    void t1() {
        SiteUser u1 = new SiteUser(null, "user1","{noop}1234", "user1@test.com");
        SiteUser u2 = new SiteUser(null, "user2","{noop}1234", "user2@test.com");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
