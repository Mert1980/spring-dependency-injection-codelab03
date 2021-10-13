package com.switchfully;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class TaxCalculator {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TaxCalculator.class);

        TaxCalculation taxCalculation = context.getBean("American", TaxCalculation.class);
        double americanTax = taxCalculation.calculateTax(23000);
        System.out.println(americanTax);
    }
}
