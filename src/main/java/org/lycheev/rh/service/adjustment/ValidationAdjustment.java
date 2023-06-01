package org.lycheev.rh.service.adjustment;

import org.lycheev.rh.model.Employee;

import java.math.BigDecimal;

public interface ValidationAdjustment {
    void validate(Employee employee, BigDecimal increase);
}
