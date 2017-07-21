package sbauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by quchy on 21/07/2017.
 * App Controller class
 */

@Controller
public class StaticController {


    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
