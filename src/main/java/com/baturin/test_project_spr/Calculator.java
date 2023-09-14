package com.baturin.test_project_spr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Calculator {


    @Autowired
    @Qualifier("multiplier")
    Operation operation;

   /* public Calculator(Operation operation) {
        this.operation = operation;
    }*/

    public void calc(double a, double b) {
        System.out.println(operation.getResult(a, b));
    }
}