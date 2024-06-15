package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDao {
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException ;
    public  boolean isExixt(String id) throws SQLException, ClassNotFoundException ;

    public void deleteItem( String code) throws SQLException, ClassNotFoundException ;


    public void saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    public void updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    public ItemDTO findItem(String code) throws SQLException, ClassNotFoundException;

    public ItemDTO getItemDtail(String newItemCode) throws SQLException, ClassNotFoundException ;

    public boolean updateQty(ItemDTO item) throws SQLException, ClassNotFoundException ;

    String genarateId() throws SQLException, ClassNotFoundException;

}
