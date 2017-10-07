package io.young.springboot.dao;

import io.young.springboot.domain.Employee;

public interface EmployeeDao {
    boolean save();

    boolean update();

    boolean delete();

    Employee getOne();
}
