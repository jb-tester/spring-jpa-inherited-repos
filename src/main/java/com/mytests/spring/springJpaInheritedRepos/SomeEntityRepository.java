package com.mytests.spring.springJpaInheritedRepos;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SomeEntityRepository extends JpaRepository<SomeEntity, Long>, BaseRepository {
    @Override
    SomeEntity findAEntityByIdForModification(Integer id);
}