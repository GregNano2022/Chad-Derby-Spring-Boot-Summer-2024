package com.GeorgeFirstproject.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!\n"  + "This is my first real Springboot App!\n" +
                        "\n"+ "Loving it!!";
    }

    //expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Remember to do your 5k 3x weekly";
    }

    //expose a new endpoint for "workout"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day";
    }
}
