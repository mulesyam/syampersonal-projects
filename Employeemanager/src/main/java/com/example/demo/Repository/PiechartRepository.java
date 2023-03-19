package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.EmployeeDao.Payslip;
import com.example.demo.EmployeeDao.Piechart;
@Repository
public interface PiechartRepository extends JpaRepository<Piechart, Integer> {

	@Query(value=  "SELECT * FROM piechart c INNER JOIN user u ON c.empid = u.empid where c.empid=?1", nativeQuery = true )
    public Piechart findPie(int empid);

}
