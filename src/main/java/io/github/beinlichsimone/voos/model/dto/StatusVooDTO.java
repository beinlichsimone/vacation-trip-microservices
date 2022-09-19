package io.github.beinlichsimone.voos.model.dto;

import io.github.beinlichsimone.voos.model.enums.StatusVooEnum;

public class StatusVooDTO {

    private StatusVooEnum status;

    public StatusVooEnum getStatus() {
        return status;
    }

    public void setStatus(StatusVooEnum status) {
        this.status = status;
    }
}
