package com.emrys.conference.repository;

import com.emrys.conference.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User save(User user){

         entityManager.persist(user);
         return user;
    }
}
