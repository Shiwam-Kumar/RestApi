package Experiment.repository;

import Experiment.bean.Employee;
import Experiment.bean.EmployeeRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository implements IEmployeeRepository{
    private List<Employee> employeeList = new ArrayList<>();
    @Override
    public Employee insert(EmployeeRequest request) {
        Employee employee = new Employee(
                UUID.randomUUID().toString(),
                request.getSalary(),
                request.getEmployeeName(),
                request.getDesignation()
        );
        employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> all() {
        return employeeList;
    }

    @Override
    public Optional<Employee> findEmployee(String id) {
        return employeeList.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst();
    }

    @Override
    public Employee updateEmployee(String id, EmployeeRequest request)
    {
        Optional<Employee> optionalEmployee = employeeList.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst();
        if(optionalEmployee.isPresent())
        {
            Employee employee = optionalEmployee.get();
            employee.setSalary(request.getSalary());
            employee.setEmployeeName(request.getEmployeeName());
            employee.setDesignation(request.getDesignation());
            return employee;
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(String id) {
        return employeeList.removeIf(employee -> employee.getId().equals(id));
    }

    @Override
    public List<Employee> findEmployeeByName(String name) {
        return employeeList.stream()
                .filter(employee -> employee.getEmployeeName().contains(name))
                .collect(Collectors.toList());
    }

}
