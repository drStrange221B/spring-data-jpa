package com.emrys.conference.service;

import com.emrys.conference.model.User;
import com.emrys.conference.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public User save(User user)
    {
        return userRepository.save(user);
    }
}
