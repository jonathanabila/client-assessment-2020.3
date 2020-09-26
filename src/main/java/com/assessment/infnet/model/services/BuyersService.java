package com.assessment.infnet.model.services;

import com.assessment.infnet.model.models.Buyer;
import com.assessment.infnet.model.repositories.IBuyersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyersService {
    @Autowired
    private IBuyersRepository buyersRepository;

    public void add(Buyer buyer) {
        buyersRepository.addBuyer(buyer);
    }

    public List<Buyer> getAll() {
        return buyersRepository.getBuyers();
    }

    public void delete(Integer id) {
        buyersRepository.deleteBuyer(id);
    }

    public Buyer getById(Integer id) {
        return buyersRepository.getBuyer(id);
    }
}
