package com.mytests.spring.springJpaInheritedRepos;

import jakarta.persistence.Entity;

@Entity
public class SomeEntity extends BaseEntity {
    String name;

    public SomeEntity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SomeEntity(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SomeEntity{" +
               "id='" + super.getId() + '\'' +
               "name='" + name + '\'' +
               '}';
    }
}
