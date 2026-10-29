package com.bugcoder.caseStudy1;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {

    public ArrayList<Feedback> fb = new ArrayList<>();

    @GetMapping("/")
    public String home(){
        System.out.println("Home call hua hai");
        return "This is the Case Study 1 - the college feedback form Portal";
    }

    @PostMapping("/add")
    public void addFeedback(
            @RequestBody
            Feedback obj
    ){
        System.out.println("Add call hua hai, current list ");
        System.out.println(fb);
        fb.add(obj);
    }

    @GetMapping("/getall")
    public ArrayList<Feedback> getAllFeedback(){
        System.out.println("getAll call hua hai, current list ");
        System.out.println(fb);
        return fb;
    }

    @DeleteMapping("/del")
    public ArrayList<Feedback> delete(
            @RequestBody
            Feedback obj
    ){
        fb.remove(obj);
        return fb;
    }
}
