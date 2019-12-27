package com.DAO;

import com.Data.FederalTax;
import com.Data.TaxObject;
import org.hibernate.Session;
import org.hibernate.exception.DataException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class TaxCalcDAO {

    Connection conn = DriverManager.getConnection("jdbc:h2:mem");

    public Vector<DatabaseRow> executeSelectingQuery(String sql) throws DataException {
        Session cs = null;
        Vector results = null;
        try {
            QueryStringCall sqlCall = new SQLCall(sql);
            cs = getClientSession();
            results = cs.executeSelectingCall(sqlCall);
        }
        catch (Exception e) {
            DataException de = new DataException(RBSPersistenceResourceConstants.UNABLE_TO_EXECUTE_QUERY,
                    new Object[] { sql }, e);
            de.setAppendCauseMessage(true);
            throw de;
        }
        finally {
            releaseClientSession(cs);
        }
        return results;
    }

    public TaxCalcDAO() throws SQLException {
    }


    public ArrayList<FederalTax> retriveFederalTax(TaxObject t){
        String sql = "";
        sql += "select * from FederalTax";
        executeSelectingQuery

        return null;
    }
}
