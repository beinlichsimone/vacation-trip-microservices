package io.github.beinlichsimone.voos.services;

import io.github.beinlichsimone.voos.model.dto.StatusVooDTO;
import io.github.beinlichsimone.voos.model.enums.StatusVooEnum;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {
    public StatusVooDTO getInfoVoo(String voo) {

        StatusVooDTO status = new StatusVooDTO();
        status.setStatus(StatusVooEnum.OK);
        return status;
    }
}
