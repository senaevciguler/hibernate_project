package hibernateProject.repositories;
import hibernateProject.configs.HibernateUtils;
import hibernateProject.models.Project;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProjectRepository {

   public List <Project> findAll() {
        Session session = HibernateUtils.openSession();
        List<Project> projects = session.createQuery("select proj from Project proj", Project.class)
                .getResultList();
        session.close();
        return projects;
    }

    public Project findById(Integer id){
        Session session = HibernateUtils.openSession();
        Project project = session.find(Project.class, id);
        session.close();
        return project;
    }

    public void save(Project project){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(project);
        transaction.commit();
        session.close();
    };

    public void delete(Project project){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(project);
        transaction.commit();
        session.close();
    };

    public void delete(Integer id){
        delete(findById(id));
    }

    public void update(Project project){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(project);
        transaction.commit();
        session.close();
    };


}
