package com.linktic.login.repository;

import com.linktic.login.model.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ISecurityRepository extends JpaRepository<Security, Integer> {

    @Query(value = "SELECT * FROM Security s WHERE s.Login = :login", nativeQuery = true)
    Optional<Security> getUserByUsername(@Param("login") String username);

}
