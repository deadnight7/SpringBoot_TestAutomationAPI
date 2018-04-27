package com.mongo.crud.example.mongocrud;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends  MongoRepository <Todo, String> {

}
