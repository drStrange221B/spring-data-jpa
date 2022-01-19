package com.emrys.conference.repository;

import com.emrys.conference.model.Registration;
import com.emrys.conference.model.RegistrationReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository

public class RegistrationRepositoryImpl implements RegistrationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Registration save(Registration registration){
        entityManager.persist(registration);

        return registration;
    }

    @Override
    public List<Registration> findAll() {
        List<Registration > registrations = entityManager.createQuery("select r from Registration r").getResultList();
        return registrations;
    }

    @Override
    public List<RegistrationReport> findAllRegistrationReport(){
//        String jpql = "select new com.emrys.conference.model.RegistrationReport(r.name, c.name, c.description) "
//                + "from Registration r, Course c where c.registration.id = r.id ";
//
//        List<RegistrationReport> registrationReports = entityManager.createQuery(jpql).getResultList();

        List<RegistrationReport> registrationReports = entityManager.createNamedQuery(Registration.REGISTRATION_REPORT).getResultList();

        return registrationReports;
    }
}
