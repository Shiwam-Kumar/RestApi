package Experiment.service;

import Experiment.bean.Employee;
import Experiment.bean.EmployeeRequest;
import Experiment.bean.responsefolder.Response;
import Experiment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private EmployeeRepository repository;
    @Override
    public Employee createEmployee(EmployeeRequest request)
    {
        return repository.insert(request);
    }

    @Override
    public List<Employee> fetch() {
        return repository.all();
    }

    @Override
    public Employee findEmployee(String id) throws Exception {
        Optional<Employee> checkEmployee = repository.findEmployee(id);
        if(checkEmployee.isPresent())
            return checkEmployee.get();
        throw new Exception(String.format("Employee with id %s does not exist",id));
    }

    @Override
    public Employee updateEmployee(String id, EmployeeRequest request) throws Exception {
        Employee emp = repository.updateEmployee(id,request);
        if(emp!=null)
            return emp;
        throw new Exception(String.format("Employee with id %s does not exist",id));
    }

    @Override
    public Response deleteEmployee(String id) throws Exception {
        boolean isDeleted = repository.deleteEmployee(id);
        if(isDeleted)
        {
            return new Response(true,String.format("Employee with id %s deleted",id));
        }
        throw new Exception(String.format("Employee with id %s is not present",id));
    }

    @Override
    public Employee findEmployeeByName(String name) throws Exception {
        Optional<Employee> checkEmployee = repository.findEmployeeByName(name);
        if(checkEmployee.isPresent())
            return checkEmployee.get();
        throw new Exception(String.format("Employee with name %s does not exist",name));
    }
}
