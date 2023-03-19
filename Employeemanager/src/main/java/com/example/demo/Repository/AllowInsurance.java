package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.EmployeeDao.EmployeeInsurence;
import com.example.demo.EmployeeDao.Insurencepolicy;

@Repository
public interface AllowInsurance extends JpaRepository<EmployeeInsurence,Integer> {

	

}
