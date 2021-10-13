package com.switchfully;

import org.springframework.stereotype.Service;

@Service
public interface TaxCalculation {

    double calculateTax(int yearlyIncome);
}
