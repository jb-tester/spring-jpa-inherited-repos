package com.mytests.spring.springJpaInheritedRepos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
    @Id @GeneratedValue
    private Integer id;


    public Integer getId() {
        return id;
    }
}
