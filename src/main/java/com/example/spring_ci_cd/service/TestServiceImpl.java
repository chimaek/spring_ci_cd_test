package com.example.spring_ci_cd.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String getTestString() {
        return "okay";
    }
}