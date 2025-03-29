package lk.ac.vau.fas.ict.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/app")
public class AppController{
    @GetMapping("/age/{ag}")
    public String MyAge(@PathVariable("ag") int age) {
        return "My Age is: "+age;
    }
}