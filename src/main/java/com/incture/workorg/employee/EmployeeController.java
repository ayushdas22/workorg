package com.incture.workorg.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/hello")
    public String greetTrainees() {
        return "Hello!! Welcome to Incture Employee Management.";
    }

    @RequestMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @RequestMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return employeeService.getEmployee(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable String id) {
        employeeService.updateEmployee(employee, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
    public void deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(id);
    }

}
