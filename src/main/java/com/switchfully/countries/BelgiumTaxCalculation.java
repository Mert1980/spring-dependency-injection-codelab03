package com.switchfully.countries;

import com.switchfully.TaxCalculation;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Belgium")
@Primary
public class BelgiumTaxCalculation implements TaxCalculation {
    @Override
    public double calculateTax(int yearlyIncome) {
        return yearlyIncome * 0.45;
    }
}
