package com.saberpro.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.saberpro.app.entity.Estudiante;

public interface EstudianteRepository extends MongoRepository<Estudiante, String>{

}
