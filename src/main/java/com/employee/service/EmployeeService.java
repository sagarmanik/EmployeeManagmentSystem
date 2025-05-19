package com.employee.service;
import java.util.List;
import com.employee.model.Employee;

public interface EmployeeService {


    void register(Employee employee);


    Employee getEmployeeByLoginIdAndPassword(String loginId, String password);

    List<Employee> getAllEmployees();
    List<Employee> getAllEmployeesExceptCurrent(String loginId);
}
