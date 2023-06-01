package org.lycheev.rh.service;

import org.lycheev.rh.model.Employee;

import java.math.BigDecimal;
import java.util.List;

public class AdjustmentService {
    private List<ValidationAdjustment> validations;

    public AdjustmentService(List<ValidationAdjustment> validations) {
        this.validations = validations;
    }

    public void validate(Employee employee, BigDecimal increase) {
        this.validations.forEach(v -> v.validate(employee, increase));

        BigDecimal salaryUpdated = employee.getSalary().add(increase);
        employee.adjustmentSalary(salaryUpdated);
    }


}
