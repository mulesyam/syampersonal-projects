package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.EmployeeDao.Employee;
import com.example.demo.EmployeeDao.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	User findByEmail( String email);
	
    User findByEmailAndPassword(String email, String password);
    @Query(value="select * from user where empid=?1 and password=?2",nativeQuery = true)
     User findData(int empid, String password);
    
    
    @Query(value="select * from user where empid=?1 and password=?2",nativeQuery = true)
	User findRole(int empid, String password);

	//User findrole(int empid, String password);

	//User findRole(int empid, String password, String role);

	//User getRole(String role);
    
   
}
