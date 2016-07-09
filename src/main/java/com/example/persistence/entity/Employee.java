package com.example.persistence.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Employee implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "joined_date")
    private LocalDate joinedDate;

    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "department_name")
    private String departmentName;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the joinedDate
     */
    public LocalDate getJoinedDate() {
        return joinedDate;
    }

    /**
     * @param joinedDate the joinedDate to set
     */
    public void setJoinedDate(LocalDate joinedDate) {
        this.joinedDate = joinedDate;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
