package ru.job4j.accident.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model model) {
        List<String> data = List.of("raz", "dva", "tri");
        model.addAttribute("lst", data);
        return "index";
    }
}
