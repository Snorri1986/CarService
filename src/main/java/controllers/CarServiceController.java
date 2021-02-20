package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * The controller class
 * @author: Denys Shabelnyk
 * @since 0.1.2
 */
@Controller
public class CarServiceController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name",required = false,
            defaultValue = "World")String name,Model model) {

        model.addAttribute("name",name);
        return "greeting";
    }

    /**
     * Method for bind html page index.html
     * with Java method
     * @since 0.3.1.4
     * @return String bind <url>:<port>/
     */
    @GetMapping("/")
    public String start() {
        return "index";
    }

}
