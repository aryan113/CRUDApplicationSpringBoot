package com.aryan.springBoot1.controller;

import com.aryan.springBoot1.entity.Department;
import com.aryan.springBoot1.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

//    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
//        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
//        LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable Long id) {
//        LOGGER.info("Inside etchDepartmentById of DepartmentController");
        return departmentService.fetchDepartmentById(id);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable Long id) {
        departmentService.deleteDepartmentById(id);
        return "Department deleted success fully";
    }

    @PutMapping("/departments/{id}")
    public  Department updateDepartment(@PathVariable Long id, @RequestBody Department department) {
        return  departmentService.updateDepartment(id, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable String name) {
//        return departmentService.fetchDepartmentByName(name);
        return departmentService.fetchDepartmentByNameIgnoreCase(name);
    }
}
