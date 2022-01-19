package com.emrys.conference.repository;

import com.emrys.conference.model.Registration;
import com.emrys.conference.model.RegistrationReport;

import java.util.List;

public interface RegistrationRepository {
    Registration save(Registration registration);

   List<Registration> findAll();
    public List<RegistrationReport> findAllRegistrationReport();
}
