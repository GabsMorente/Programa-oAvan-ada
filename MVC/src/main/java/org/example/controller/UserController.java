package org.example.controller;


import org.example.model.entities.User;
import org.example.repository.UserRepository;

import java.util.List;

public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    public void cadastrarUsuario(String nome, String email, String senha) {
        User user = new User(nome, email, senha);
        repository.save(user);
    }

    public List<User> listarUsuarios() {
        return repository.findAll();
    }
}

