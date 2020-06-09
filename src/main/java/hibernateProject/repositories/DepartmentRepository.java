package hibernateProject.repositories;

import hibernateProject.configs.HibernateUtils;
import hibernateProject.models.Department;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DepartmentRepository {

/*    public List <Department> findAll() {
        Session session = openSession();
        List<Department> department = session.createQuery("select p from Department p", Department.class)
                .getResultList();
        session.close();
        return department;
    }*/

    public Department findById(Integer id){
        Session session = HibernateUtils.openSession();
        Department department = session.find(Department.class, id);
        session.close();
        return department;
    }

    public void save(Department department){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(department);
        transaction.commit();
        session.close();
    };

    public void delete(Department department){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(department);
        transaction.commit();
        session.close();
    };

    public void delete(Integer id){
        delete(findById(id));
    }

    public void update(Department department){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(department);
        transaction.commit();
        session.close();
    };


}
