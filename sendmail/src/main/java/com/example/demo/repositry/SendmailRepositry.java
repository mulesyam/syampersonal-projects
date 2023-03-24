package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.SendDao;

@Repository
public interface SendmailRepositry extends JpaRepository<SendDao,Integer > {



}
