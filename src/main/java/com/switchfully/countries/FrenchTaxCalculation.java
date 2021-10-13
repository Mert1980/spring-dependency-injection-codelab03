package com.switchfully.countries;

import com.switchfully.TaxCalculation;
import org.springframework.stereotype.Component;

@Component("French")
public class FrenchTaxCalculation implements TaxCalculation {
    @Override
    public double calculateTax(int yearlyIncome) {
        return yearlyIncome * 0.48;
    }
}
