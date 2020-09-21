package com.assessment.infnet.models.services;

import com.assessment.infnet.models.dao.User;
import com.assessment.infnet.models.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public User userExists(String userName) {
        return userRepository.findByUserName(userName);
    }

    public boolean authenticate(String userName, String password) {
        return userRepository.authenticate(userName, password)  != null;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }
}
