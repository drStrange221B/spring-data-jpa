package com.emrys.conference.service;

import com.emrys.conference.model.Course;
import com.emrys.conference.model.Registration;
import com.emrys.conference.model.RegistrationReport;
import com.emrys.conference.repository.CourseRepository;
import com.emrys.conference.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    @Transactional
    public Registration addRegistration(Registration registration)
    {

        Registration registration1=null;
        if(registration.getId()==null) {
            registration1 = registrationRepository.save(registration);

            Course course = new Course();
            course.setName("INTRO");
            course.setDescription("Everyone Must Take This Course");
            course.setRegistration(registration);

            courseRepository.save(course);
        }else{

            registration1 =  registrationRepository.save(registration);


        }

        return registration1;
    }

    @Override
    public List<Registration> findAll() {

     List<Registration> registrations = registrationRepository.findAll();

        return registrations;

    }

    @Override
    public List<RegistrationReport> registrationReport() {

       List<RegistrationReport> registrationReports = registrationRepository.registrationReport();
        return registrationReports;
    }
}
