package com.linktic.login.repository;

import com.linktic.login.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "SELECT * FROM employee e WHERE e.idContact = :idContact", nativeQuery = true)
    List<Employee> findEmployeesByContactId(@Param("idContact") Integer idContact);

}
