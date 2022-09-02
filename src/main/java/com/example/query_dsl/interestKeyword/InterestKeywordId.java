package com.example.query_dsl.interestKeyword;

import com.example.query_dsl.user.entity.SiteUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterestKeywordId implements Serializable {

    private SiteUser user;
    private String content;
}
