package org.example.course.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.example.course.entities.User;
import org.example.course.repositories.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert (User obj) {
        return repository.save(obj);
    }
}
