// src/main/java/com/example/demo/repository/UserRepository.java
package com.dhl.spring.SpringBootDemo.repository;


import com.dhl.spring.SpringBootDemo.entity.LocalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocalUserRepository extends JpaRepository<LocalUser, Integer> {
    Optional<LocalUser> findByUserId(Integer userId);
}
