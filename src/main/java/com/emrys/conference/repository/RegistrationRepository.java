package com.emrys.conference.repository;

import com.emrys.conference.model.Registration;
import com.emrys.conference.model.RegistrationReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Long> {

     List<RegistrationReport> registrationReport();

}
