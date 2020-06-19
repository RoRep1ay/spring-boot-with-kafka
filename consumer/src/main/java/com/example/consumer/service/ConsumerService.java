package com.example.consumer.service;

import com.example.lib.models.StudentPayload;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerService {
  public static final String TOPIC = "pbmembers";

  @KafkaListener(topics = TOPIC, groupId = "group_id", containerFactory = "studentKafkaListenerContainerFactory")
  public void consume(StudentPayload studentPayload) throws IOException {
    log.info(String.format("#### -> Consumed message -> %s, FROM PARTITION %d", studentPayload.toString(), 1));
  }
}
