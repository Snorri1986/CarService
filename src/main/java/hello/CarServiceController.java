package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * The controller class
 * @author Denys Shabelnyk
 * @since 0.1.2
 */
@Controller
public class CarServiceController {

    /**
     * The method returns phrase "Hello world"
     * @author Denys Shabelnyk
     * @since 0.3.1.1
     * @param name user name
     * @param model Model object
     * @return String html page
     */
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name",required = false,
            defaultValue = "World")String name,Model model) {

        model.addAttribute("name",name);
        return "greeting";
    }

    /**
     * The method returns index.html page
     * @author Denys Shabelnyk
     * @since 0.3.1.1
     * @return String index.html page
     */
    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    /**
     * The method returns register.html page
     * @author Denys Shabelnyk
     * @since 0.3.1.1
     * @return String register.html page
     */
    @GetMapping("/register")
    public String register() {
        return "register.html";
    }

    /**
     * The method returns login.html page
     * @author Denys Shabelnyk
     * @since 0.3.1.1
     * @return String login.html page
     */
    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

}
