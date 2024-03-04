package com.example.spring_ci_cd.controller;

import com.example.spring_ci_cd.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class TestController {

  private final TestService testService;

  @GetMapping("/test") // localhost:8080/api/test
  public String getTestString() {

    return testService.getTestString();
  }

  @GetMapping("/good")
  public String good(){
    return "good";
  }
}