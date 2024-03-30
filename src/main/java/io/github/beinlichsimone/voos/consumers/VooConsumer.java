package io.github.beinlichsimone.voos.consumers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.beinlichsimone.voos.model.dto.PayloadVooConsumerDTO;
import io.github.beinlichsimone.voos.services.ConsultaService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class VooConsumer {

    @Autowired
    private ConsultaService consultaService;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload Message message) throws JsonProcessingException {
        PayloadVooConsumerDTO payload = objectMapper.readValue(message.getPayload().toString(), PayloadVooConsumerDTO.class);
        System.out.println("Mensagem recebida: " + message);
        consultaService.getInfoVoo(payload.getVoo());
    }

}
