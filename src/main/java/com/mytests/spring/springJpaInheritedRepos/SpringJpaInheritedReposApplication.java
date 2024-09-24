package com.mytests.spring.springJpaInheritedRepos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaInheritedReposApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaInheritedReposApplication.class, args);
    }
 @Bean
     public CommandLineRunner commandLineRunner(SomeEntityService someEntityService, AnotherEntityService anotherEntityService ) {
         return args -> {
             System.out.println("--------------------------------------");
             someEntityService.populateDB();
             someEntityService.testQuery();
             someEntityService.testQuery2();
             anotherEntityService.populateDB();
             anotherEntityService.testQuery();
             System.out.println("--------------------------------------");
         };
     }
}
