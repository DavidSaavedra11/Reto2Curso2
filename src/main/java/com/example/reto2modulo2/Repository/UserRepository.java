package com.example.reto2modulo2.Repository;

import com.example.reto2modulo2.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, Integer> {
Optional<User> getUserByEmail(String email);
Optional<User> getUserByEmailAndPassword(String email, String password);
}
