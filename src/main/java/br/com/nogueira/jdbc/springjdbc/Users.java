package br.com.nogueira.jdbc.springjdbc;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

public record Users(
        @Id
        Integer id,
        String username,
        String password,
        String email,
        @Version
        Integer version) {
}
