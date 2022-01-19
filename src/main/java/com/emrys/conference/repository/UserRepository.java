package com.emrys.conference.repository;

import com.emrys.conference.model.User;

public interface UserRepository {
    User save(User user);
}
