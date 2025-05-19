package com.employee.dao;
import java.util.List;
import com.employee.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.save(employee);
    }


    @Override
    @Transactional
    public Employee findByLoginIdAndPassword(String loginId, String password) {
        Session session = sessionFactory.getCurrentSession();
        return (Employee) session.createQuery("FROM Employee WHERE loginId = :loginId AND password = :password")
                .setParameter("loginId", loginId)
                .setParameter("password", password)
                .uniqueResult();
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Employee", Employee.class).list();
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployeesExceptCurrent(String loginId) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Employee WHERE loginId != :loginId", Employee.class)
                .setParameter("loginId", loginId)
                .list();
    }

}
