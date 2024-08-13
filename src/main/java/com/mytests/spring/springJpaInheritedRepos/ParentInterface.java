package com.mytests.spring.springJpaInheritedRepos;

import jakarta.persistence.LockModeType;
import jakarta.persistence.QueryHint;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

public interface ParentInterface {

    @Query("SELECT p FROM #{#entityName} p WHERE p.id = :id")
    BaseEntity findAEntityByIdForModification(Integer id);
}
