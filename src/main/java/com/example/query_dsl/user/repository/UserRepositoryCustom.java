package com.example.query_dsl.user.repository;

import com.example.query_dsl.user.entity.SiteUser;

import java.util.List;

public interface UserRepositoryCustom {
    SiteUser getQslUser(Long id);

    long getQslCount();

    SiteUser getQslUserOrderByIdAscOne();

    List<SiteUser> searchQsl(String user1);
}
