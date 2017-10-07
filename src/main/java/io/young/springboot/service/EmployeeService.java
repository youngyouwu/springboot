package io.young.springboot.service;

import io.young.springboot.domain.Employee;

import java.util.List;

public interface EmployeeService {
    boolean save(Employee employee);

    boolean update(Employee employee);

    boolean delete(Integer id);

    Employee getOne(Integer id);

    List<Employee> getAll(Integer pageNum);
}
