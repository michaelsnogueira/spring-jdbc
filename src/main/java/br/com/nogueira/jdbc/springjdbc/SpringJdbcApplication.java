package br.com.nogueira.jdbc.springjdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcApplication.class, args);
    }

//    @Bean
//    public List<Users> findAllUsers(UserRepository userRepository) {
//        System.out.println("findAllUsers" + userRepository.findAll());
//        return userRepository.findAll();
//    }

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            userRepository.save(new Users(1, "admin1", "teste", "michael@gmail.com", null));
            userRepository.save(new Users(2, "user1", "pass1", "michael@gmail.com", null));
            userRepository.findByUsername("user1").ifPresent(System.out::println);
            userRepository.findAll().forEach(users -> System.out.println("User:" + users));
        };
    }
}
