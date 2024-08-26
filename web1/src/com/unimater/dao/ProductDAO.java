package com.unimater.dao;

import com.unimater.model.Product;

import java.sql.Connection;

public class ProductDAO extends GenericDAOImpl<Product> implements GenericDAO<Product> {
    @Override
    public Product getById(int id) {
        return null;
    }

    public ProductDAO(Connection connection) {
        super(Product::new, connection);
        this.tableName = "product";
    }

}