package com.employee.service;
import java.util.List;
import com.employee.dao.EmployeeDao;
import com.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;


    @Override
    public void register(Employee employee) {
        employeeDao.saveEmployee(employee);
    }


    @Override
    public Employee getEmployeeByLoginIdAndPassword(String loginId, String password) {
        return employeeDao.findByLoginIdAndPassword(loginId, password);
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeDao.getAllEmployees();
        System.out.println("Employees: " + employees);
        return employees;
    }
    @Override
    public List<Employee> getAllEmployeesExceptCurrent(String loginId) {
        return employeeDao.getAllEmployeesExceptCurrent(loginId);
    }


}
