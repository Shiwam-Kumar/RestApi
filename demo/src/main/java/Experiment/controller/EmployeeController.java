package Experiment.controller;

import Experiment.bean.Employee;
import Experiment.bean.EmployeeRequest;
import Experiment.bean.responsefolder.Response;
import Experiment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("employees")
    public Employee postEmployee(@RequestBody EmployeeRequest request)
    {
       return service.createEmployee(request);
    }
    @GetMapping("employees/search")
    public List<Employee> getEmployees() {
        return service.fetch();
    }
    @GetMapping(value = "employees/search", params = {"id"})
    public Employee findEmployee(@RequestParam(value = "id") String id) throws Exception {
        return service.findEmployee(id);
    }
    @PutMapping("employees/{id}")
    public Employee updateEmployee(@PathVariable String id,
                                   @RequestBody EmployeeRequest request) throws Exception {
        return service.updateEmployee(id,request);
    }
    @DeleteMapping("employees/{id}")
    public Response deleteEmployee(@PathVariable String id) throws Exception {
        return service.deleteEmployee(id);
    }
    @GetMapping(value = "employees/search", params = {"name"})
    public Employee findEmployeeByName(@RequestParam(value = "name") String name) throws Exception {
        return service.findEmployeeByName(name);
    }
}
