package com.example.persistence.dao.config;


import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

@ApplicationScoped
public class DataSourceProducer {

    @Resource(lookup = "java:global/ExampleDataSource")
    private DataSource dataSource;

    private Dialect dialect = new PostgresDialect();

    @Produces
    public DataSource getDataSource() {
        return dataSource;
    }

    @Produces
    public Dialect getDialect() {
        return dialect;
    }
}