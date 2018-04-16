package com.greenfoxacademy.restbackend.controller;

import com.greenfoxacademy.restbackend.model.Doubling;
import com.greenfoxacademy.restbackend.model.Fail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

  @GetMapping("/")
  public String openMain() {
    return "index";
  }
}


