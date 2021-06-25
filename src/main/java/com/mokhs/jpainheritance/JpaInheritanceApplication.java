package com.mokhs.jpainheritance;

import com.mokhs.jpainheritance.domain.Book;
import com.mokhs.jpainheritance.domain.Movie;
import com.mokhs.jpainheritance.repository.ItemJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaInheritanceApplication {

    @Autowired
    private ItemJpaRepository itemJpaRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaInheritanceApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner() {

        return (args) -> {

            Book book = new Book("JPA!", 2000, "anonymous", "12-321");
            Movie movie = new Movie("EXIT", 20000, "anonymous", "anonymous");

            this.itemJpaRepository.save(book);
            this.itemJpaRepository.save(movie);
        };

    }

}
