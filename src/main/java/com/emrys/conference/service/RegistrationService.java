package com.emrys.conference.service;

import com.emrys.conference.model.Registration;
import com.emrys.conference.model.RegistrationReport;

import javax.transaction.Transactional;
import java.util.List;

public interface RegistrationService {
    @Transactional
    Registration addRegistration(Registration registration);

    public List<Registration> findAll();
   public List<RegistrationReport> registrationReport();
}
