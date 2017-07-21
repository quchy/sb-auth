package sbauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by quchy on 21/07/2017.
 * App Controller class
 */

@RestController
public class HomeController {


    @RequestMapping("/")
    public String home() {
        return "Home, sweet home!";
    }
}
