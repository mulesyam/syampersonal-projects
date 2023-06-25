package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.EmployeeDao.EmployeeDao;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDao, Integer>{

	 public EmployeeDao findByEmail(String email);

	//public EmployeeDao findBydepartment(String department);

	public EmployeeDao findByDepartment(String department);


	public EmployeeDao findByEmpname(String empname);

	public EmployeeDao findByphone(String phone);



}
