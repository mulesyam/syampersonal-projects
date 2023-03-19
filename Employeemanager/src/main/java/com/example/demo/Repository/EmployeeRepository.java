package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.EmployeeDao.Employee;
import com.example.demo.EmployeeDao.User;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	 
	 @Query(value=  "SELECT * FROM profile p INNER JOIN user u ON p.empid = u.empid where p.empid=?1", nativeQuery = true )
	    public Employee findByEmpid (int empid);
 }
 