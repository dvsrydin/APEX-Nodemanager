package app.controller;

import app.config.ApplicationPaths;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/" + ApplicationPaths.SETTINGS_PAGE)
public class SettingsController {

    @GetMapping
    public String getSettings(){
        return ApplicationPaths.SETTINGS_PAGE;
    }

}