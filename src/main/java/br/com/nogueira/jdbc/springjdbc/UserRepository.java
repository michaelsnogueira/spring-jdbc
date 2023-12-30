package br.com.nogueira.jdbc.springjdbc;

import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface UserRepository extends ListCrudRepository<Users, String> {
    Optional<Users> findByUsername(String username);
}
