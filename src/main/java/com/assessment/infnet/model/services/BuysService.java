package com.assessment.infnet.model.services;

import com.assessment.infnet.model.models.Buy;
import com.assessment.infnet.model.repositories.IBuysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuysService {
    @Autowired
    private IBuysRepository buysRepository;

    public void Add(Buy buy) {
        buysRepository.addBuy(buy);
    }

    public List<Buy> getAll() {
        return buysRepository.getBuys();
    }

    public void delete(Integer id) {
        buysRepository.deleteBuy(id);
    }

    public Buy getById(Integer id) {
        return buysRepository.getBuy(id);
    }
}
