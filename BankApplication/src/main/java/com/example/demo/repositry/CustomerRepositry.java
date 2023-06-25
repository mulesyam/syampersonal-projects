package com.example.demo.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerDao;

@Repository
public interface CustomerRepositry extends JpaRepository<CustomerDao, Integer>{
	

	List<CustomerDao> findByEmail(String username);

}
