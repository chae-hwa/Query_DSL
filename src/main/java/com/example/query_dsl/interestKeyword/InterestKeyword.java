package com.example.query_dsl.interestKeyword;

import com.example.query_dsl.user.entity.SiteUser;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@IdClass(InterestKeywordId.class)
public class InterestKeyword {
    @Id
    @ManyToOne
    @EqualsAndHashCode.Include
    private SiteUser user;

    @Id
    @EqualsAndHashCode.Include
    private String content;
}