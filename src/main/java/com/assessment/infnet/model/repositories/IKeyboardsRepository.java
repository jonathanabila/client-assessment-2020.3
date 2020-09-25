package com.assessment.infnet.model.repositories;

import com.assessment.infnet.model.models.Keyboard;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8083/api/keyboard", name = "keyboardClient")
public interface IKeyboardsRepository {
    @GetMapping(value = "/")
    List<Keyboard> getKeyboards();

    @GetMapping(value = "/{id}")
    Keyboard getKeyboard(@PathVariable Integer id);
}
