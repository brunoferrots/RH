package org.lycheev.rh.model;

import org.lycheev.rh.ValidationException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Employee {
    private PersonalData personalData;
    private LocalDate dateOfLastAdjustment;

    public Employee(String name, String cpf, Job job, BigDecimal salary) {
        this.personalData = new PersonalData(name, cpf, job, salary);
    }

    public void adjustmentSalary(BigDecimal newSalary) {
        this.personalData.setSalary(newSalary);
        this.dateOfLastAdjustment = LocalDate.now();
    }

    public String getName() {
        return this.personalData.getName();
    }

    public void setName(String name) {
        this.personalData.setName(name);
    }

    public String getCpf() {
        return this.personalData.getCpf();
    }

    public void setCpf(String cpf) {
        this.personalData.setCpf(cpf);
    }

    public Job getJob() {
        return this.personalData.getJob();
    }

    public void setJob(Job job) {
        this.personalData.setJob(job);
    }

    public BigDecimal getSalary() {
        return this.personalData.getSalary();
    }

    public void setSalary(BigDecimal salary) {
        this.personalData.setSalary(salary);
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
