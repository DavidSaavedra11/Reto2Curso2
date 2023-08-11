package com.example.reto2modulo2.Repository;

import com.example.reto2modulo2.Model.Gadget;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GadgetRepository extends MongoRepository<Gadget, Integer> {
}
