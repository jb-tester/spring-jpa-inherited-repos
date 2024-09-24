package com.mytests.spring.springJpaInheritedRepos;

import jakarta.persistence.Entity;

@Entity
public class AnotherEntity extends BaseEntity {

    String title;

    public AnotherEntity(String title) {
        this.title = title;
    }

    public AnotherEntity() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "AnotherEntity{" +
               "id='" + super.getId() + '\'' +
               "title='" + title + '\'' +
               '}';
    }
}
