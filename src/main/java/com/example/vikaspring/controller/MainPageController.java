package com.example.vikaspring.controller;

import com.example.vikaspring.service.ViewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class MainPageController {
    private final ViewService viewService;
    @RequestMapping("/main")
    public String showMainPage(Model model){
        model.addAttribute("data",viewService.getAllMovies());
        return "Main.html";
    }
}
