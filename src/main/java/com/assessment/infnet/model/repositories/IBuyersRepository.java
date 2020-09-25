package com.assessment.infnet.model.repositories;

import com.assessment.infnet.model.models.Buyer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url = "http://localhost:8083/api/buyer", name = "buyerClient")
public interface IBuyersRepository {
    @PostMapping(value = "/add")
    void addBuyer(@RequestBody Buyer buyer);

    @DeleteMapping(value = "/{id}")
    void deleteBuyer(@PathVariable Integer id);

    @GetMapping(value = "/")
    List<Buyer> getBuyers();

    @GetMapping(value = "/{id}")
    Buyer getBuyer(@PathVariable Integer id);
}
