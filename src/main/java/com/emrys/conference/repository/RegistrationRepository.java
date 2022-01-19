package com.emrys.conference.repository;

import com.emrys.conference.model.Registration;

import java.util.List;

public interface RegistrationRepository {
    Registration save(Registration registration);

   List<Registration> findAll();
}
