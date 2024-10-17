package com.example.spring_profile_poc.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class SmppConfig {

  @Value("${smpp.host}")
  private String smppHost;

  @Value("${smpp.port}")
  private int smppPort;

  @Value("${smpp.systemId}")
  private String smppSystemId;

  @Value("${smpp.password}")
  private String smppPassword;

  @Value("${smpp.enquireLinkTimer}")
  private int enquireLinkTimer;

  @Value("${smpp.transactionTimer}")
  private int transactionTimer;
  
}
