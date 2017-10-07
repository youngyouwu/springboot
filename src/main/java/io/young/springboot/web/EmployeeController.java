package io.young.springboot.web;

import io.young.springboot.domain.Employee;
import io.young.springboot.domain.MyMessage;
import io.young.springboot.service.EmployeeService;
import io.young.springboot.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public MyMessage save(Employee employee) {
        employeeService.save(employee);
        MyMessage message = MessageUtil.success(null);
        return message;
    }

    @PutMapping("/{empId}")
    public MyMessage update(Employee employee) {
        employeeService.update(employee);
        MyMessage message = MessageUtil.success(null);
        return message;
    }

    @GetMapping("/{empId}")
    public MyMessage getOne(@PathVariable Integer empId) {
        Map data = new HashMap();
        Employee employee = employeeService.getOne(empId);
        data.put("emp", employee);
        MyMessage message = MessageUtil.success(data);
        return message;
    }

    @GetMapping("/{pageNum}")
    public MyMessage getAll(@PathVariable Integer pageNum) {
        Map data = new HashMap();
        List<Employee> list = employeeService.getAll(pageNum);
        data.put("list", list);
        MyMessage message = MessageUtil.success(data);
        return message;
    }

    @DeleteMapping("/{empId}")
    public MyMessage delete(@PathVariable Integer empId) {
        employeeService.delete(empId);
        MyMessage message = MessageUtil.success(null);
        return message;
    }
}
