package com.example.fintech_app.fintech_application.practice.repository;

import com.example.fintech_app.fintech_application.practice.model.UserTest;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserTestRepository extends CrudRepository<UserTest, Integer> {
}
