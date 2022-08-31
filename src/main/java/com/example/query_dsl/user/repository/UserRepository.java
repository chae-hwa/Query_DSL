package com.example.query_dsl.user.repository;


import com.example.query_dsl.user.entity.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<SiteUser, Long>, UserRepositoryCustom {

    List<SiteUser> findByInterestKeywords_content(String 축구);
}