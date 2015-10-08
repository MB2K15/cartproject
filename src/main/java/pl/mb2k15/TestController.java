package pl.mb2k15;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String showMsg(@RequestParam int age, Model model){
        int newAge = age + 20;
        model.addAttribute("nickName", "myName");
        model.addAttribute("age", newAge);
        return "test";
    }
}
