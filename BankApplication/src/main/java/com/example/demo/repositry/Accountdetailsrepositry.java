package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BalancedetailsDao;

@Repository
public interface Accountdetailsrepositry extends JpaRepository<BalancedetailsDao,  Integer> {

	

}
