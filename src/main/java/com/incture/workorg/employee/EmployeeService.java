package com.incture.workorg.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    List<Employee> employees = new ArrayList<>(Arrays.asList(
//            new Employee("MM01", "Mark Henry", "mark@incture.com", "9874563210", "2 yrs", "Associate Consultant"),
//            new Employee("MM02", "Shubham Singh", "shubham@incture .com", "8877556622", "3,5 yrs", "Associate Director"),
//            new Employee("MM03", "Riya Kumari", "riya@incture.com", "9878792013", "8 months", "Technical Lead ")
    ));

    public List<Employee> getEmployees() {
        //return employees;
        List<Employee> employeeList = new ArrayList<>();
        for (Employee employee : employeeRepository.findAll()) {
            employeeList.add(employee);
        }
        return employeeList;
    }

    // TODO :: Remove stream way of doing and do the normal way of matching the id from the employee list and return
    public Employee getEmployee(String id) {
        return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().get();
    }

    public void createEmployee(Employee employee) {
        //employee.add(employee);
        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee, String id) {

        employeeRepository.save(employee);

    }

    public void deleteEmployee(String id) {
//        employees.removeIf(t -> t.getId().equals(id));

        employeeRepository.deleteById(id);
    }
}
