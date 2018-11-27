package edu.csumb.cst438.zooshopspring.data;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
interface UsersRepository extends MongoRepository<Users, String> {
    Users findByusername(String username);
}