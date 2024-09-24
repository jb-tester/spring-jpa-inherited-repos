package com.mytests.spring.springJpaInheritedRepos;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BaseRepository {

    @Query("SELECT p FROM #{#entityName} p WHERE p.id = :id")
    BaseEntity findAnEntityByIdForModification(Integer id);

    @Query("SELECT p.id FROM #{#entityName} p")
    List<Integer> findAnEntityIds();
}
