package com.example.spring_ci_cd.service;

public interface TestService {

    String getTestString();

    default String getTestString2() {
        return "okay";
    }

}