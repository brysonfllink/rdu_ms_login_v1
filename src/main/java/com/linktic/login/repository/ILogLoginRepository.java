package com.linktic.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.linktic.login.model.LogLogin;

@Repository
public interface ILogLoginRepository extends JpaRepository<LogLogin, Integer> {

}
