package kz.shop.controller.web;

import kz.shop.controller.ProductController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomePageController {
    private final ProductController restController;

    @Autowired
    public WelcomePageController(ProductController restController) {
        this.restController = restController;
    }

    @GetMapping("/")
    public String example(Model model) {
        model.addAttribute("productList", restController.getAllProducts());
        model.addAttribute("pageTitle", "Welcome to My Website");
        return "main";

    }
}
