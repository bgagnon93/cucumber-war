package com.automation.web;

import io.cucumber.core.cli.Main;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PortalController {

    @GetMapping("/")
    public String home(Model model) {
        return "start";
    }

    @PostMapping("/")
    public String run() {
        String[] cucumberArgs = {
                "-g", "classpath:com/automation/steps",
                "--tags", "@Test",
                "classpath:features"
        };
        Main.run(cucumberArgs, Thread.currentThread().getContextClassLoader());
        return "test";
    }
}
