package com.baturin.test_project_spr;

import org.springframework.stereotype.Component;

@Component("multiplier")
public class Multiplier implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a * b;
    }
}