package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.EmployeeDao.DependentDao;

@Repository
public interface DependencyRepository extends JpaRepository<DependentDao, Integer> {
	

}
