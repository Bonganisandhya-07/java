package com.example.SpringBoot.Interface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot.model.Software;


public interface SoftwareInt extends JpaRepository<Software,Integer> {

}
