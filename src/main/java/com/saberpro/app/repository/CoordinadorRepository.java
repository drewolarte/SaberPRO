package com.saberpro.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.saberpro.app.entity.Coordinador;

public interface CoordinadorRepository extends MongoRepository<Coordinador, String>{

}
