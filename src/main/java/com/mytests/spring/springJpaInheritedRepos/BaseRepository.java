package com.mytests.spring.springJpaInheritedRepos;

import org.springframework.data.jpa.repository.Query;

public interface BaseRepository {

    @Query("SELECT p FROM #{#entityName} p WHERE p.id = :id")
    BaseEntity findAEntityByIdForModification(Integer id);
}
