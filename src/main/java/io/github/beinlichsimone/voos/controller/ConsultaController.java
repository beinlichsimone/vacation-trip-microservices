package io.github.beinlichsimone.voos.controller;

import io.github.beinlichsimone.voos.model.dto.StatusVooDTO;
import io.github.beinlichsimone.voos.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @RequestMapping("/{voo}")
    public StatusVooDTO getInfoVoo(@PathVariable String voo){
        return consultaService.getInfoVoo(voo);

    }
}
