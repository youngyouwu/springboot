package io.young.springboot.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity(name = "t_emp")
public class Employee implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "emp_id")
    private Integer empId;
    @Column(name = "emp_name")
    private String empName;
    private String gender;
    private String email;
    @Column(name = "dept_id")
    private Integer deptId;
}
