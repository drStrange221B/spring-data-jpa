package com.emrys.conference.controller;

import com.emrys.conference.model.Registration;
import com.emrys.conference.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute ("registration") Registration registration) {
        return "registration";
    }

    @GetMapping("registrations")
    public @ResponseBody List<Registration> getRegistrations(){
        List<Registration> registrations = registrationService.findAll();

        return registrations;

    }
    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute ("registration")
                                              Registration registration,
                                  BindingResult result) {

        if(result.hasErrors()) {
            System.out.println("There were errors");
            return "registration";
        }else {
            registrationService.addRegistration(registration);
        }

        System.out.println("Registration: " + registration.getName());

        return "redirect:registration";
    }

}
