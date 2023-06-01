package org.lycheev.rh.service.adjustment;

import org.lycheev.rh.ValidationException;
import org.lycheev.rh.model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidationAdjustmentPeriodicity implements ValidationAdjustment {
    public void validate(Employee employee, BigDecimal increase) {
        var dateOfLastAdjustment = employee.getDateOfLastAdjustment();
        var dateCurrent = LocalDate.now();
        var dateDifference = ChronoUnit.MONTHS.between(dateOfLastAdjustment, dateCurrent);
        if (dateDifference < 6) {
            throw new ValidationException("Invalid date");
        }
    }
}
