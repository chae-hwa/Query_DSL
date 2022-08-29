package com.example.query_dsl.user.repository;

import com.example.query_dsl.user.entity.SiteUser;

public interface UserRepositoryCustom {
    SiteUser getQslUser(Long id);

    long getQslCount();

    SiteUser getQslUserOrderByIdAscOne();
}
