package com.example.quizzone.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quizzone.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods for user entity
}