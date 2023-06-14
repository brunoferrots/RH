package org.lycheev.rh.model;

import java.math.BigDecimal;

public class Outsourced {

    private PersonalData personalData;

    public Outsourced(String name, String cpf, Job job, BigDecimal salary) {
        this.personalData = new PersonalData(name, cpf, job, salary);
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
}
