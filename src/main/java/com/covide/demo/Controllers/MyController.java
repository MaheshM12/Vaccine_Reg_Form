package com.covide.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.covide.demo.Models.User;
import com.covide.demo.Services.demoService;

@Controller
public class MyController {

@Autowired
    demoService demo;

    @GetMapping("/")
    public String meth() {
        return "index"; 
    }
    
     @PostMapping("/userform")
    public String welcome(@ModelAttribute User user, Model model) {
          model.addAttribute("username", user.getUsername());
         model.addAttribute("IdType", user.getIdType());
         model.addAttribute("IdDetail", user.getIdDetail());
         model.addAttribute("contactnumber", user.getContactnumber());
         model.addAttribute("vaccineName", user.getVaccineName());
          demo.Add(user);
         List<User> data =demo.getAllDetails();
         model.addAttribute("use", data);
        
         return "allinfo";
    }

}
