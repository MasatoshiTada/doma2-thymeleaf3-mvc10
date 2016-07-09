package com.example.persistence.dao.config;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.sql.DataSource;

@ApplicationScoped
public class DomaConfig implements Config {

    @Inject
    private DataSource dataSource;

    @Inject
    private Dialect dialect;

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public Dialect getDialect() {
        return dialect;
    }

}