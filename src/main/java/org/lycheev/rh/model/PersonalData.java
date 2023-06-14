package org.lycheev.rh.model;

import java.math.BigDecimal;

public class PersonalData {

    private String name;
    private String cpf;
    private Job job;
    private BigDecimal salary;

    public PersonalData(String name, String cpf, Job job, BigDecimal salary) {
        this.name = name;
        this.cpf = cpf;
        this.job = job;
        this.salary = salary;
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
}
