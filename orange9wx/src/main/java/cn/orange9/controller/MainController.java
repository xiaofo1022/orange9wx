package cn.orange9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.orange9.repository.UserRepository;

@Controller
public class MainController {

  @Autowired
  private UserRepository userRepository;
  
  @RequestMapping("/")
  public String index() {
    return "index";
  }
  
  @RequestMapping("/users")
  public String users(Model model) {
    model.addAttribute("allusers", userRepository.findAll());
    return "users";
  }
}
