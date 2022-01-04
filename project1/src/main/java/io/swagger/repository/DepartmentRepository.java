package io.swagger.repository;

import io.swagger.model.Category;
import io.swagger.model.Department;

import java.util.List;

public interface DepartmentRepository {

    List<Department> getDepartments();

    Department getDepartmentById(Long id);

    Department addDepartment(Department department);

    List<Department> addDepartments(List<Department> departments);

    Department updateDepartment(Long id, Department departments);

    void deleteDepartment(Long id);
}
