package com.expense.tracker.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.expense.tracker.model.Users;

@Repository
public interface UserRepository extends MongoRepository<Users, Integer> {
	
	Users findByUsername(String username);

}
