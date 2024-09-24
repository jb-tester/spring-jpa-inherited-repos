package com.mytests.spring.springJpaInheritedRepos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnotherEntityService {

    final AnotherEntityRepository anotherEntityRepository;

    public AnotherEntityService(AnotherEntityRepository anotherEntityRepository) {
        this.anotherEntityRepository = anotherEntityRepository;
    }

    public void populateDB() {
        anotherEntityRepository.save(new AnotherEntity("aaa"));
        anotherEntityRepository.save(new AnotherEntity("bbb"));
        anotherEntityRepository.save(new AnotherEntity("ccc"));
    }

    public void testQuery() {
        System.out.println("====== own query =====");
        anotherEntityRepository.findByTitle("aaa").forEach(System.out::println);
        System.out.println("===================");
    }

    ;

}
