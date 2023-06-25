package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.EmployeeDao.Employee;
import com.example.demo.EmployeeDao.Payslip;

@Repository
public interface PayslipRepository extends JpaRepository<Payslip, Integer>{

	@Query(value=  "SELECT * FROM payslip p INNER JOIN user u ON p.empid = u.empid where p.empid=?1", nativeQuery = true )
    public Payslip findData(int empid);

	
}
