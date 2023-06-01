package org.lycheev.rh.model;

import org.lycheev.rh.ValidationException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Employee {
    private String name;
    private String cpf;
    private Job job;
    private BigDecimal salary;
    private LocalDate dateOfLastAdjustment;

    public Employee(String name, String cpf, Job job, BigDecimal salary) {
        this.name = name;
        this.cpf = cpf;
        this.job = job;
        this.salary = salary;
    }

    public void adjustmentSalary(BigDecimal newSalary) {
        this.salary = newSalary;
        this.dateOfLastAdjustment = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfLastAdjustment() {
        return dateOfLastAdjustment;
    }

    public void setDateOfLastAdjustment(LocalDate dateOfLastAdjustment) {
        this.dateOfLastAdjustment = dateOfLastAdjustment;
    }

    public void promote(Job nextInTheHierarchy) {
        this.setJob(nextInTheHierarchy);
    }
}
