package com.aryan.springBoot1.service;

import com.aryan.springBoot1.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long id);

    public void deleteDepartmentById(Long id);

    public Department updateDepartment(Long id, Department department);

    public Department fetchDepartmentByName(String name);

    public Department fetchDepartmentByNameIgnoreCase(String name);
}
