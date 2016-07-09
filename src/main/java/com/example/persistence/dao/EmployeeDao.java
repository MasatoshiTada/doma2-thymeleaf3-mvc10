package com.example.persistence.dao;

import com.example.persistence.dao.config.InjectDomaConfig;
import com.example.persistence.entity.Employee;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

@Dao
@InjectDomaConfig
public interface EmployeeDao {
    @Select
    Employee selectById(int id);
}
