package com.covide.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covide.demo.Models.User;
import com.covide.demo.Respository.Repo;

@Service
public class demoService {
      @Autowired
    Repo repo;
    public void Add(User user) {
        repo.save(user);
    }
     
    public List<User> getAllDetails(){
          List<User> data=repo.findAll();
        return  data;
    }  
}
