package com.baturin.test_project_spr;

import org.springframework.stereotype.Component;

@Component("divider")
public class Divider implements Operation {
    @Override
    public double getResult(double a, double b) {
        /*if (b == 0) {
            throw new IllegalArgumentException("Divide by zero error");
        }
        return a / b;*/
        try {
            return a / b;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return 0D;
    }
}