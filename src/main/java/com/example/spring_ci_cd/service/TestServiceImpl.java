package com.example.spring_ci_cd.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

  @Value("${server.port}")
  private String port;

  @Value("${spring.application.name}")
  private String applicationName;

  @Override
  public String getTestString() {
    return "okay" + " " + applicationName + " " + port;
  }
}