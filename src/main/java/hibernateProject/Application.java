package hibernateProject;
import hibernateProject.models.Department;
import hibernateProject.models.Employee;
import hibernateProject.models.Project;
import hibernateProject.repositories.DepartmentRepository;
import hibernateProject.repositories.EmployeeRepository;
import hibernateProject.repositories.ProjectRepository;

public class Application {

    public static void main ( String[] args ) {
/*        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.delete(5);*/
/*        System.out.println(employeeRepository.findById(1).getFirstName());
        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Smith");
        employee.setDateOfBirth(new Date());
        employee.setEmployeeId(5);
        employeeRepository.save(employee);*/
/*
        ProjectRepository repository = new ProjectRepository();
        Project project = new Project();
        project.setDescription("new Project");
        project.setTransientField("transient");
        repository.save(project);

 */
/*
        DepartmentRepository departmentRepository = new DepartmentRepository();
        Department department = new Department();
        department.setDepartmentId(1);
/*
/*        Project project = repository.findById(1);
        System.out.println(project.getDescription());

        project = new Project();
        project.setDescription("New Java Project");
        project.setProjectId(5);
        repository.save(project);*//*
        Project project = repository.findById(4);
        project.setDescription("Another Java Project");
        repository.update();*/

        EmployeeRepository repository = new EmployeeRepository();
        Employee employee = repository.findById(1);
        System.out.println(employee.getDepartments().getName());

    }
}
