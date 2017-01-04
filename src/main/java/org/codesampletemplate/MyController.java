package org.codesampletemplate;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class MyController {

    @RequestMapping("/")
    String index() {
        return "index";
    }
}