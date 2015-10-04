package fi.teaching.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kjanowsk on 2015-10-03.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String getIndex() {
        return "index";
    }
}
