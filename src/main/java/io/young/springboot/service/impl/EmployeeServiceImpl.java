package io.young.springboot.service.impl;

import io.young.springboot.domain.Employee;
import io.young.springboot.repository.EmployeeRepository;
import io.young.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public boolean save(Employee employee) {
        employeeRepository.save(employee);
        return false;
    }

    @Override
    public boolean update(Employee employee) {
        employeeRepository.save(employee);
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        employeeRepository.delete(id);
        return false;
    }

    @Override
    public Employee getOne(Integer id) {
        Employee employee = employeeRepository.findOne(id);
        return employee;
    }

    public List<Employee> getAll(Integer pageNum) {
        List<Employee> list = employeeRepository.findAll();
        return list;
    }
}
