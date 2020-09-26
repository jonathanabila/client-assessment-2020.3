package com.assessment.infnet.model.services;

import com.assessment.infnet.model.models.CoffeeMachine;
import com.assessment.infnet.model.models.Product;
import com.assessment.infnet.model.repositories.ICoffeeMachinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeMachinesService extends ProductsService{
    @Autowired
    private ICoffeeMachinesRepository coffeeMachinesRepository;

    public List<? extends Product> getAll() {
        return coffeeMachinesRepository.getCoffeeMachines();
    }

    public CoffeeMachine getById(Integer id) {
        return coffeeMachinesRepository.getCoffeeMachine(id);
    }
}
