package kz.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/")
    public String helloWorld(Model model){
        String string = "I am a string in controller class";
        model.addAttribute("message", string);
        return "index";
    }
}
