package Experiment.bean;

public class EmployeeRequest {
    Long salary;
    String employeeName;
    String designation;

    public EmployeeRequest(Long salary, String employeeName, String designation) {
        this.salary = salary;
        this.employeeName = employeeName;
        this.designation = designation;
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
