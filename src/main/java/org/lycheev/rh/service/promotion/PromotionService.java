package org.lycheev.rh.service.promotion;

import org.lycheev.rh.ValidationException;
import org.lycheev.rh.model.Employee;
import org.lycheev.rh.model.Job;

public class PromotionService {

    public void promote(Employee employee, boolean achievedGoal) {
        var currentJob = employee.getJob();

        if (currentJob.equals(Job.MANAGER)) {
            throw new ValidationException("Managers can't be promoted");
        }

        if (achievedGoal) {
            employee.promote(currentJob.getNextInTheHierarchy());
        } else {
            throw new ValidationException("Employee don't achieved goal");
        }
    }
}
