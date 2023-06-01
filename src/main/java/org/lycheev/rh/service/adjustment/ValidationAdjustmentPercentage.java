package org.lycheev.rh.service.adjustment;

import org.lycheev.rh.ValidationException;
import org.lycheev.rh.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidationAdjustmentPercentage implements ValidationAdjustment {

    public void validate(Employee employee, BigDecimal increase) {
        BigDecimal salaryCurrent = employee.getSalary();
        BigDecimal adjustmentPercentage = increase.divide(salaryCurrent, RoundingMode.HALF_UP);
        if (adjustmentPercentage.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidationException("Adjustment cannot exceed 40% of the salary!");
        }
    }
}
