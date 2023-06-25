package com.example.demo.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CarddetialsDao;

@Repository
public interface CardRepositry  extends JpaRepository<CarddetialsDao, Integer>{

	
}
