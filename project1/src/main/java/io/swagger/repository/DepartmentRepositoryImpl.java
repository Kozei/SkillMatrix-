package io.swagger.repository;

import io.swagger.dao.DepartmentDao;
import io.swagger.model.Category;
import io.swagger.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentRepositoryImpl implements DepartmentRepository {

    @Autowired
    private DepartmentDao departmentDao;


    @Override
    public List<Department> getDepartments() {
        return departmentDao.findAll();
    }

    @Override
    public Department getDepartmentById(Long id) {
        return departmentDao.findById(id).orElse(null);
    }

    @Override
    public Department addDepartment(Department department) {
        return departmentDao.save(department);
    }

    @Override
    public List<Department> addDepartments(List<Department> departments) {
        departmentDao.saveAll(departments);
        return departments;
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
        Department existingDepartment = departmentDao.findById(id).orElse(null);
        existingDepartment.setDepartment(department.getDepartment());
        return departmentDao.save(existingDepartment);
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentDao.deleteById(id);

    }
}
