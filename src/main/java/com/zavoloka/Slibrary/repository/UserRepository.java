package com.zavoloka.Slibrary.repository;

import com.zavoloka.Slibrary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Additional custom queries or methods can be added here if needed
}