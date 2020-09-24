package com.assessment.infnet.model.services;

import com.assessment.infnet.model.models.User;
import com.assessment.infnet.model.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public boolean userExists(String userName) {
        return userRepository.findByUserName(userName);
    }

    public Object authenticate(String userName, String password) {
        return userRepository.authenticate(userName, password);
    }

    public void addUser(User user) {
        userRepository.addUser(user);
    }
}
