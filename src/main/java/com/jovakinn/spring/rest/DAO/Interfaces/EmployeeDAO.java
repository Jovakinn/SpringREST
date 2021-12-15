package com.jovakinn.spring.rest.DAO.Interfaces;

import com.jovakinn.spring.rest.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(Integer id);

    public void deleteEmployee(Integer id);
}
