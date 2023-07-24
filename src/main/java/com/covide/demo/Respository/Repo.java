package com.covide.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covide.demo.Models.User;

@Repository
public interface Repo extends JpaRepository <User,Integer> {
   
}
