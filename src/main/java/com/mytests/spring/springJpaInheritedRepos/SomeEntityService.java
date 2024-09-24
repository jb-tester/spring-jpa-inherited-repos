package com.mytests.spring.springJpaInheritedRepos;

import org.springframework.stereotype.Service;

@Service
public class SomeEntityService {

    private final SomeEntityRepository someEntityRepository;

    public SomeEntityService(SomeEntityRepository someEntityRepository) {
        this.someEntityRepository = someEntityRepository;
    }

    public void populateDB() {
        someEntityRepository.save(new SomeEntity("aaa"));
        someEntityRepository.save(new SomeEntity("bbb"));
        someEntityRepository.save(new SomeEntity("ccc"));
    }

    public void testQuery() {
        System.out.println("====== inherited and overrided query:  =====");
        Integer id = someEntityRepository.findAll().get(0).getId();
        System.out.println(id);
        System.out.println(someEntityRepository.findAnEntityByIdForModification(id));
    }

    public void testQuery2() {
        System.out.println("====== inherited query: =====");
        someEntityRepository.findAnEntityIds().forEach(System.out::println);
        System.out.println("===================");
    }

    ;

}
