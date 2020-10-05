package github.gopal.repository;

import github.gopal.beans.Employee;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Gopal
 */
@Named(EmployeeRepository.COMPONENT_NAME)
public class ListEmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee("Gopalll", "J");
        employees.add(employee);
        return employees;
    }

}
