package com.assessment.infnet.model.repositories;

import com.assessment.infnet.model.models.Buy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url = "http://localhost:8083/api/buy", name = "buyClient")
public interface IBuysRepository {

    @PostMapping(value = "/add")
    void addBuy(@RequestBody Buy buy);

    @DeleteMapping(value = "/{id}")
    void deleteBuy(@PathVariable Integer id);

    @GetMapping(value = "/")
    List<Buy> getBuys();

    @GetMapping(value = "/{id}")
    Buy getBuy(@PathVariable Integer id);
}
