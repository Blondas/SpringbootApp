package app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping
    public String home() {
        return "cos tam";
    }

    @RequestMapping("/foo")
    public String foo() {
        return "foo";
    }
}
