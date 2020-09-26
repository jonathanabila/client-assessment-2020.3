package com.assessment.infnet.model.services;

import com.assessment.infnet.model.models.Monitor;
import com.assessment.infnet.model.repositories.IMonitorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorsService extends ProductsService{
    @Autowired
    private IMonitorsRepository monitorsRepository;

    public List<Monitor> getAll() {
        return monitorsRepository.getMonitors();
    }

    public Monitor getById(Integer id) {
        return monitorsRepository.getMonitor(id);
    }
}
