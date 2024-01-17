package com.example.thaytu.Controller;

import com.example.thaytu.Model.Staff;
import com.example.thaytu.reponsitory.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StaffController {
    @Autowired
    StaffRepository staffRepository;

    //show
    @GetMapping("/home")
    public ModelAndView haha() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Staff> staffList = staffRepository.findAll();
        modelAndView.addObject("searchStaff", staffList);
        return modelAndView;
    }
    //them
    @GetMapping("/add")
    public ModelAndView Add(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("addStaff",new Staff());
        return modelAndView;
    }


    @PostMapping("/save")
    public ModelAndView save(Staff staff){
        ModelAndView modelAndView = new ModelAndView("create");
        return modelAndView;
    }






}
