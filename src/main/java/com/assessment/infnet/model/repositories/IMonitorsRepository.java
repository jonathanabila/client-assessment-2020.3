package com.assessment.infnet.model.repositories;

import com.assessment.infnet.model.models.Monitor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8083/api/product/monitor", name = "monitorClient")
public interface IMonitorsRepository {
    @GetMapping(value = "/")
    List<Monitor> getMonitors();

    @GetMapping(value = "/{id}")
    Monitor getMonitor(@PathVariable Integer id);
}
