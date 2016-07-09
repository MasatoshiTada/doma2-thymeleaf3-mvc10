package com.example.web.controller;

import com.example.persistence.entity.Employee;
import com.example.service.EmployeeService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/employee")
@RequestScoped
@Produces(MediaType.TEXT_HTML)
public class EmployeeController {

    @Inject
    private EmployeeService employeeService;

    @Inject
    private Models models;

    @Path("/index")
    @GET
    @Controller
    public String index() {
        return "employee/index.html";
    }

    @Path("/result")
    @GET
    @Controller
    public String result(@QueryParam("id") int id) {
        Employee employee = employeeService.selectById(id);
        models.put("employee", employee);
        return "employee/result.html";
    }
}
