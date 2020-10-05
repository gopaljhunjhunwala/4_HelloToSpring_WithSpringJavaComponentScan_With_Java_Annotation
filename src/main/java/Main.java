import github.gopal.beans.Employee;
import github.gopal.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Author: Gopal
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        EmployeeService employeeServiceBean1 = applicationContext.getBean(EmployeeService.COMPONENT_NAME, EmployeeService.class);
        System.out.println(employeeServiceBean1);

        EmployeeService employeeServiceBean2 = applicationContext.getBean(EmployeeService.COMPONENT_NAME, EmployeeService.class);
        System.out.println(employeeServiceBean2);

        List<Employee> allEmployees = employeeServiceBean1.getAllEmployees();

        System.out.println(allEmployees.get(0).getFirstName());
        System.out.println(allEmployees.get(0).getLastName());
    }
}
