package com.example.interviewquestionsandanswers.RESTAPI.repo;

import com.example.interviewquestionsandanswers.RESTAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
