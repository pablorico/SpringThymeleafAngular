package spring.thymeleaf.angular.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping("/")
    String index(){
        return "home";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
         return "Login";
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(){
         return "Home";
    }
}