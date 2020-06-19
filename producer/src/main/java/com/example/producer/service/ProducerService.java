package com.example.producer.service;

import com.example.lib.models.StudentPayload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProducerService {
  public static final String TOPIC = "pbmembers";

  @Autowired private KafkaTemplate<String, StudentPayload> kafkaTemplate;

  public void sendMessage(StudentPayload message) {
    log.info(String.format("#### -> Producing Message -> %s", message));
    this.kafkaTemplate.send(TOPIC, message);
  }
}
