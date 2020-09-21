package com.assessment.infnet.models.repository;

import com.assessment.infnet.models.dao.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface IUserRepository extends CrudRepository<User, Integer>{

    @Query("from User u where u.userName = :userName and u.password = :password")
    User authenticate(String userName, String password);

    User findByUserName(String userName);
}
