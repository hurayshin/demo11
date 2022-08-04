package com.example.demo11.Repository;

import com.example.demo11.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    Optional<Users> getAllById(Long id);
}
