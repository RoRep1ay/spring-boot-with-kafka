package com.example.producer.controller;

import com.example.lib.models.StudentPayload;
import com.example.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/producer")
public class ProducerWebController {
  @Autowired
  private ProducerService producerService;

  @PostMapping()
  public ResponseEntity<StudentPayload> test(@RequestBody StudentPayload studentPayload) {
    this.producerService.sendMessage(studentPayload);
    return ResponseEntity.ok(studentPayload);
  }
}
