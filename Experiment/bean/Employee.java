package Experiment.bean;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
    String id;
    Long salary;
    String employeeName;
    String designation;

    public Employee(String id, Long salary, String employeeName, String designation) {
        this.id = id;
        this.salary = salary;
        this.employeeName = employeeName;
        this.designation = designation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getSalary() {
        return salary;
    }
    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
