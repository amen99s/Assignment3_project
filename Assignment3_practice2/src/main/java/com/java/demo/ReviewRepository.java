package com.java.demo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "reviews")
public interface ReviewRepository extends CrudRepository<Review,Integer>{
	Review findByBookId(Integer bookId);
}