package io.young.springboot.dao.impl;

import io.young.springboot.dao.EmployeeDao;
import io.young.springboot.domain.Employee;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public boolean save() {
        return false;
    }

    @Override
    public boolean update() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public Employee getOne() {
        return null;
    }
}
