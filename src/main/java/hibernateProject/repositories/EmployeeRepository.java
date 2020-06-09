package hibernateProject.repositories;

import hibernateProject.configs.HibernateUtils;
import hibernateProject.models.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeRepository {

/*
    public List<Employee> findAllFromDepartment(String departmentName){
        Session session = HibernateUtils.openSession();
        Query employeeQuery
    }

 */



    public Employee findById(Integer id) {
        Session session = HibernateUtils.openSession();
        Employee employee = session.find(Employee.class, id);
        session.close();
        return employee;
    }

    public void save(Employee employee) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();
    }

    public void delete(Employee employee) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(employee);
        transaction.commit();
        session.close();
    }

    public void delete(Integer id) {
        delete(findById(id));
    }

    public void update(Employee employee) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(employee);
        transaction.commit();
        session.close();
    }

    ;

}

