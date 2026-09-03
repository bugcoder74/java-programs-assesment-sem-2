package com.bugcoder.hellowREST;

import org.springframework.web.bind.annotation.*;

@RestController
public class HellowRestController {

    @GetMapping("/greet")
    public String hellow(){
        return "Hellow Spring !";
    }

    @PostMapping("/greet")
    public String hellowPost(@RequestBody String name){
        return "Data I get in request is "+name+" !";
    }

    @GetMapping("/greetJson")
    public HellowResponseModel hellowJson(){
        return new HellowResponseModel("Hellow Spring !");
    }

    @PostMapping("/greetJson")
    public HellowResponseModel hellowPostJson(@RequestBody String name){
        return new HellowResponseModel("Data I get in request is "+name+" !");
    }

    @GetMapping("/greet/{x}")
    public String hellow(@PathVariable String x){
        return "Hellow "+x+" Welcome !";
    }
}
