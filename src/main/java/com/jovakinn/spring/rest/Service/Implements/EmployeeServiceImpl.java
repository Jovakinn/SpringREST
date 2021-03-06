package com.jovakinn.spring.rest.Service.Implements;

import com.jovakinn.spring.rest.DAO.Interfaces.EmployeeDAO;
import com.jovakinn.spring.rest.Service.interfaces.EmployeeService;
import com.jovakinn.spring.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(Integer id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(Integer id) {
        employeeDAO.deleteEmployee(id);
    }
}
