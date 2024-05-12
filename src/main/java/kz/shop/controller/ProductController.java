package kz.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    private final ProductRestController restController;

    @Autowired
    public ProductController(ProductRestController restController) {
        this.restController = restController;
    }

    @GetMapping("/")
    public String example(Model model) {
        model.addAttribute("myData", restController.getAllProducts());
        model.addAttribute("pageTitle", "Welcome to My Website");
        return "main";

    }
}
