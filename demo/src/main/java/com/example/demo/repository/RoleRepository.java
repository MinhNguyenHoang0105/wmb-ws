package com.example.demo.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.model.Role;

public interface RoleRepository extends MongoRepository<Role, ObjectId> {

	public List<Role> findAll();
	
	//tai lieu tham khao
	//https://stackoverflow.com/questions/12730370/spring-data-mongodb-findby-method-for-nested-objects?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
	@Query(value = "{'role_name' : 'admin' }")
	public Role findbyRole();
}
