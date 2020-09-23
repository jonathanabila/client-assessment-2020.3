package com.assessment.infnet.model.repositories;

import org.springframework.cloud.openfeign.FeignClient;
import com.assessment.infnet.model.models.User;
import org.springframework.web.bind.annotation.*;


@FeignClient(url = "http://localhost:8081/api/user", name="userClient")
public interface IUserRepository {

    @PostMapping(value = "/login")
    User authenticate(@RequestParam String userName, @RequestParam String password);

    @GetMapping(value = "/{userName}")
    User findByUserName(@PathVariable String userName);

    @PostMapping(value = "/add")
    void addUser(@RequestBody User user);
}
