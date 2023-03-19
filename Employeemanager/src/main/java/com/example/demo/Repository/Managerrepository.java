package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.EmployeeDao.Employee;

@Repository
public interface Managerrepository extends CrudRepository<Employee, Integer>{

}
