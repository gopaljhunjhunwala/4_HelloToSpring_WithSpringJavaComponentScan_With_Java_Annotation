package github.gopal.service;

import github.gopal.beans.Employee;
import github.gopal.repository.EmployeeRepository;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Author: Gopal
 */
@Named(EmployeeService.COMPONENT_NAME)
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;

    @Inject
    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override public List<Employee> getAllEmployees() {
        return repository.getAllEmployees();
    }

}
