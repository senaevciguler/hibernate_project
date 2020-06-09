package hibernateProject.configs;
import hibernateProject.models.Employee;
import hibernateProject.models.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import java.util.Properties;

public class HibernateUtils {

    private static SessionFactory sessionFactory;

    private HibernateUtils(){};

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
                settings.put(Environment.URL,
                        "jdbc:mysql://localhost:3306/human_Resources");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "Java2019.");
                settings.put(Environment.DIALECT,
                        "org.hibernate.dialect.MySQL5Dialect");
                settings.put(Environment.SHOW_SQL, "false");
                configuration.setProperties(settings);
                configuration.addAnnotatedClass(Employee.class);
                configuration.addAnnotatedClass(Project.class);
                ServiceRegistry serviceRegistry = new
                        StandardServiceRegistryBuilder().
                        applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }

    public static Session openSession(){
        return getSessionFactory().openSession();
    }

}
