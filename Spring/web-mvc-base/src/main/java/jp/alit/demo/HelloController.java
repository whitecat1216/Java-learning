package jp.alit.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
  @GetMapping("/hello")
  public String hello(Model model) {
    model.addAttribute("message", "Hello Spring Boot 3.0.");
    return "hello";
  }
}
