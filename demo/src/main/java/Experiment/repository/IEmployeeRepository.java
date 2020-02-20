package Experiment.repository;

import Experiment.bean.Employee;
import Experiment.bean.EmployeeRequest;

import java.util.List;
import java.util.Optional;

public interface IEmployeeRepository {
    Employee insert(EmployeeRequest request);
    List<Employee> all();
    Optional<Employee> findEmployee(String id);
    Employee updateEmployee(String id, EmployeeRequest request);
    boolean deleteEmployee(String id);
    Optional<Employee> findEmployeeByName(String name);
}
