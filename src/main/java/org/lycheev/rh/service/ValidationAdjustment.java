package org.lycheev.rh.service;

import org.lycheev.rh.model.Employee;

import java.math.BigDecimal;

public interface ValidationAdjustment {
    void validate(Employee employee, BigDecimal increase);
}
