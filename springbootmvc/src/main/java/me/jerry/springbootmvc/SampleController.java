package me.jerry.springbootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
  @GetMapping("/hello")
  public String hello(Model model){
    model.addAttribute("name", "soojae");
    return "hello";
  }
}