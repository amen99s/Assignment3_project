package com.java.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path = "books")
public interface BookRepository extends CrudRepository<Book,Integer>{
}
