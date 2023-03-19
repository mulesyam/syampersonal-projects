package com.example.demo.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.EmployeeDao.Insurencepolicy;
import com.example.demo.EmployeeDao.LeaveManagement;
import com.example.demo.EmployeeDao.Leavestatus;
@Repository
public interface LeaveRepository extends JpaRepository<LeaveManagement, Integer>
{
	@Query(value = "select *  from newtable  where status is null", nativeQuery = true)
	List<LeaveManagement> viewleaves(); 
	
	
	  @Query(value = "select * from newtable where status is NULL ", nativeQuery = true)
	 Leavestatus findOne(int empid);

      LeaveManagement findById(int empid);


	

	
	 
	
	
	
}
