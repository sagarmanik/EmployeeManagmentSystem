package com.employee.dao;
import java.util.List;
import com.employee.model.Employee;

public interface EmployeeDao {


    void saveEmployee(Employee employee);


    Employee findByLoginIdAndPassword(String loginId, String password);

    List<Employee> getAllEmployees();
    List<Employee> getAllEmployeesExceptCurrent(String loginId);
}
