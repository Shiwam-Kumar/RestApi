package Experiment.service;

import Experiment.bean.Employee;
import Experiment.bean.EmployeeRequest;
import Experiment.bean.responsefolder.Response;

import java.util.List;

public interface IEmployeeService {
    Employee createEmployee(EmployeeRequest request);
    List<Employee> fetch();
    Employee findEmployee(String id) throws Exception;
    Employee updateEmployee(String id, EmployeeRequest request) throws Exception;
    Response deleteEmployee(String id) throws Exception;
    List<Employee> findEmployeeByName(String name) throws Exception;
}
