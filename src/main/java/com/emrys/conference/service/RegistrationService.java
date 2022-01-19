package com.emrys.conference.service;

import com.emrys.conference.model.Registration;

import java.util.List;

public interface RegistrationService {
    Registration addRegistration(Registration registration);

    List<Registration> findAll();
}
