package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.*;
import java.time.LocalDate;

public interface OrderDao {
    public String genarateOrderId() throws SQLException, ClassNotFoundException ;

    public boolean orderIdExixt(String orderId) throws SQLException, ClassNotFoundException ;

    public boolean saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;

    public void commite() throws SQLException, ClassNotFoundException ;
}
