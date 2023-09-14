package com.baturin.test_project_spr;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("subtractor")
public class Subtractor implements Operation {

    @Override
    public double getResult(double a, double b) {
        return a - b;
    }
}