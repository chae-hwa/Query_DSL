package com.example.query_dsl.interestKeyword;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InterestKeyword {
    @Id
    private String content;

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof  InterestKeyword)) return false;

        InterestKeyword that = (InterestKeyword) o;

        return content.equals(that.content);
    }

    @Override
    public int hashCode(){
        return content.hashCode();
    }
}
