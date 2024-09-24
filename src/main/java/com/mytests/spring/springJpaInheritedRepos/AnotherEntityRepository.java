package com.mytests.spring.springJpaInheritedRepos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AnotherEntityRepository extends JpaRepository<AnotherEntity, Long>, BaseRepository {
    @Override
    AnotherEntity findAnEntityByIdForModification(Integer id);


    List<AnotherEntity> findByTitle(String title);
}