package org.j2gl.springbootstrap.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
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

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/admin")
    public String adminHome(final Model model) {
        model.addAttribute("appName", appName);
        return "admin/admin-home";
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/user")
    public String userHome(final Model model) {
        model.addAttribute("appName", "User Home");
        return "user/user-home";
    }

    @GetMapping("/custom-login")
    public String login(final Model model) {
        model.addAttribute("appName", appName);
        return "login";
    }

}
