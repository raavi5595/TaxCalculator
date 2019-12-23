package com.DAO;

import com.Data.FederalTax;
import com.Data.TaxObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class TaxCalcDAO {

    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:2020/taxcalculator");

    public TaxCalcDAO() throws SQLException {
    }


    public ArrayList<FederalTax> retriveFederalTax(TaxObject t){
        String sql = "";
        sql += "select * from taxCalculator.FederalTax";
        sql+= "";


        return null;
    }
}
