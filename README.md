#Hibernate
##configs
####HibernateUtils
#####Using Hibernate Framework as:
######import org.hibernate.Session;
######import org.hibernate.SessionFactory;
######import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
######import org.hibernate.cfg.Configuration;
######import org.hibernate.cfg.Environment;
######import org.hibernate.service.ServiceRegistry;
##model
####Department
####Employee
####Project
##repositories
####DepartmentRepository
####EmployeeRepository
####ProjectRepository
##Application(main method)
######public static void main ( String[] args ) {
             EmployeeRepository repository = new EmployeeRepository();
                     Employee employee = repository.findById(1);
                     System.out.println(employee.getDepartments().getName());
          }



