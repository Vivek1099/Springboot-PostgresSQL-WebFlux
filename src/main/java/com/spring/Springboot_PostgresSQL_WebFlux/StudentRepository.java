package com.spring.Springboot_PostgresSQL_WebFlux;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StudentRepository extends ReactiveCrudRepository<Student,Integer>
{

}
