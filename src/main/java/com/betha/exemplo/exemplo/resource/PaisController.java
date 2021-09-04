package com.betha.exemplo.exemplo.resource;

import com.betha.exemplo.exemplo.model.Pais;
import com.betha.exemplo.exemplo.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/paises")
public class PaisController {
    @Autowired
    private PaisRepository repository;

    @GetMapping
    public List<Pais> getPaises(){
        return repository.findAll();
    }
}
