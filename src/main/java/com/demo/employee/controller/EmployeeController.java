package com.demo.employee.controller;


import com.demo.employee.pojo.Employee;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping("/list")
    public ResponseEntity <List<Employee>> findList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Santosh Khadka","khadka@gmail.com"));
        employeeList.add(new Employee(2,"Bibek Mahatara","mahatara@gmail.com"));
        employeeList.add(new Employee(3,"Sagar phuyal","phuyal@gmail.com"));
        employeeList.add(new Employee(4,"Raj Pujara","raj@gmail.com"));
        employeeList.add(new Employee(5,"Umesh Chalise","chalise@gmail.com"));
        employeeList.add(new Employee(2,"Bibek Rawat","rawat@gmail.com"));

        return ResponseEntity.ok(employeeList);

    }

    @GetMapping("/{id}")
    public ResponseEntity <Employee> findById(@PathVariable Integer id) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Santosh Khadka","khadka@gmail.com"));
        employeeList.add(new Employee(2,"Bibek Mahatara","mahatara@gmail.com"));
        employeeList.add(new Employee(3,"Sagar phuyal","phuyal@gmail.com"));
        employeeList.add(new Employee(4,"Raj Pujara","raj@gmail.com"));
        employeeList.add(new Employee(5,"Umesh Chalise","chalise@gmail.com"));
        employeeList.add(new Employee(2,"Bibek Rawat","rawat@gmail.com"));

        for (Employee emp: employeeList) {
            if (emp.getId().equals(id)) {
                return ResponseEntity.ok(emp);
            }
        }
        return ResponseEntity.ok(new Employee());


    }

    @PostMapping()
    public ResponseEntity <List<Employee>> create(@RequestBody Employee employee) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Santosh Khadka","khadka@gmail.com"));
        employeeList.add(new Employee(2,"Bibek Mahatara","mahatara@gmail.com"));
        employeeList.add(new Employee(3,"Sagar phuyal","phuyal@gmail.com"));
        employeeList.add(new Employee(4,"Raj Pujara","raj@gmail.com"));
        employeeList.add(new Employee(5,"Umesh Chalise","chalise@gmail.com"));
        employeeList.add(new Employee(2,"Bibek Rawat","rawat@gmail.com"));
        employeeList.add(employee);

        return ResponseEntity.ok(employeeList);


    }
}
