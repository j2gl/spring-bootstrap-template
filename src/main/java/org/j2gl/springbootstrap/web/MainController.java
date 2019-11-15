package org.j2gl.springbootstrap.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @Value("${info.app.description}")
    private String appName;

    @GetMapping("/")
    public String homePage(final Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }

    @GetMapping("/login")
    public String login(final Model model) {
        model.addAttribute("appName", appName);
        return "login";
    }

}
