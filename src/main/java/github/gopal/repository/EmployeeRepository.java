package github.gopal.repository;

import github.gopal.beans.Employee;

import java.util.List;

/**
 * Author: Gopal
 */
public interface EmployeeRepository {

    String COMPONENT_NAME = "employeeRepository";

    List<Employee> getAllEmployees();
}
