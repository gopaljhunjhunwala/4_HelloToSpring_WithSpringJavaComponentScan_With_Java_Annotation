package github.gopal.service;

import github.gopal.beans.Employee;

import java.util.List;

/**
 * Author: Gopal
 */
public interface EmployeeService {

    String COMPONENT_NAME = "employeeService";

    List<Employee> getAllEmployees();
}
