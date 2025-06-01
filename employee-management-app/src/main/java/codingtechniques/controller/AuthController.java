package codingtechniques.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // це login.html у папці templates
    }

    @GetMapping("/")
    public String redirectToEmployees() {
        return "redirect:/employees";
    }
}
