package com.example.service;

import com.example.persistence.dao.EmployeeDao;
import com.example.persistence.entity.Employee;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

@ApplicationScoped
public class EmployeeService {

    @Inject
    private EmployeeDao employeeDao;

    @Transactional(TxType.REQUIRED)
    public Employee selectById(int id) {
        return employeeDao.selectById(id);
    }
}
