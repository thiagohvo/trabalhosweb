package com.unimater.dao;

import com.unimater.model.SaleItem;

import java.sql.Connection;

public class SaleItemDAO extends GenericDAOImpl<SaleItem> implements GenericDAO<SaleItem> {
    @Override
    public SaleItem getById(int id) {
        return null;
    }

    public SaleItemDAO(Connection connection) {
        super(SaleItem::new, connection);
        this.tableName = "sale_item";
    }

    // Outros métodos específicos de SaleItem podem ser adicionados aqui
}