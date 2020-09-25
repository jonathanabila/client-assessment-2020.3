package com.assessment.infnet.model.repositories;

import com.assessment.infnet.model.models.CoffeeMachine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url = "http://localhost:8083/api/coffee-machine", name = "coffeeMachineClient")
public interface ICoffeeMachinesRepository {
    @GetMapping(value = "/")
    List<CoffeeMachine> getCoffeeMachines();

    @GetMapping(value = "/{id}")
    CoffeeMachine getCoffeeMachine(@PathVariable Integer id);
}
