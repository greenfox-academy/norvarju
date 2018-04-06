package com.greenfoxacademy.springstart;

import com.greenfoxacademy.springstart.Model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  /*@GetMapping("/")
  public String mainPage() {
    return "index";
  }*/

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@RequestParam(name = "username") String username, Model model) {
    return "redirect:/?name=" + username;
  }

  @GetMapping("/{username}")
  public String ShowProfile(@PathVariable(name = "username") String username, Model model) {
    model.addAttribute("name", fox.getName());
    model.addAttribute("numberOfTricks", fox.getListOfString().size());
    model.addAttribute("food", fox.getFood());
    model.addAttribute("drink", fox.getDrink());
    return "index";
  }


}
