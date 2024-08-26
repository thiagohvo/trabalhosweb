package com.unimater.dao;

import com.unimater.model.Sale;

import java.sql.Connection;

public class SaleDAO extends GenericDAOImpl<Sale> implements GenericDAO<Sale> {
    @Override
    public Sale getById(int id) {
        return null;
    }

    public SaleDAO(Connection connection) {
        super(Sale::new, connection);
        this.tableName = "sale";
    }


}