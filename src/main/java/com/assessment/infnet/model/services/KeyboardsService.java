package com.assessment.infnet.model.services;

import com.assessment.infnet.model.models.Keyboard;
import com.assessment.infnet.model.repositories.IKeyboardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyboardsService {
    @Autowired
    private IKeyboardsRepository keyboardsRepository;

    public List<Keyboard> getAll() {
        return keyboardsRepository.getKeyboards();
    }

    public Keyboard getById(Integer id) {
        return keyboardsRepository.getKeyboard(id);
    }
}
