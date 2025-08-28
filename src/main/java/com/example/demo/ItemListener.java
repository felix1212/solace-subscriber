package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ItemListener {

  @Value("${app.queue.name}")
  private String queueName;

  @JmsListener(destination = "${app.queue.name}")
  public void onMessage(String json) {
    // In your POC, this is “data from PostgreSQL through Solace”
    System.out.println("[Subscriber] Received from " + queueName + ": " + json);
    // TODO: transform/process or write to another system if desired
  }
}
