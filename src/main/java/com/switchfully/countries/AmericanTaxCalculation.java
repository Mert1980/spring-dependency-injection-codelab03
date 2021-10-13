package com.switchfully.countries;

import com.switchfully.TaxCalculation;
import org.springframework.stereotype.Component;

@Component("American")
public class AmericanTaxCalculation implements TaxCalculation {

    @Override
    public double calculateTax(int yearlyIncome) {
        return yearlyIncome * 0.18  + 950;
    }
}
