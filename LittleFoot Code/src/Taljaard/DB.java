/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taljaard;

/*
To get your Java progrm to connect to MS Access you have to download UCanAccess at
https://sourceforge.net/projects/ucanaccess/files/
and add the following JAR files to the classpath:
    ucanaccess-4.0.4.jar
    hsqldb-2.3.1.jar
    jackcess-2.1.11.jar
    commons-lang-2.6.jar
    commons-logging-1.1.3.jar
The version numbers here may differ than the latest versions you downloaded.
https://www.codejava.net/java-se/jdbc/java-jdbc-example-connect-to-microsoft-access-database
Add these libraries to the NetBeans Project
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB { 

    private static final String url = "jdbc:ucanaccess://C:/Users/kkadz/OneDrive/LittleFoot Code/LittleFootDatabase.accdb";

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public DB() {
        //Step 1: Loading or registering UCanAccess JDBC driver class
//        try {
//            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Problem in loading or registering UCanAccess JDBC driver");
//            ex.printStackTrace();
//        }

        // Opening database connection
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (null != connection) {
                // and then finally close connection
                connection.close();
            }
        } catch (SQLException sqlex) {
            System.out.println(url);
            sqlex.printStackTrace();
        }

        // Cleanup resources after closing the connection
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }

    public ResultSet executeQuery(String query)  {
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        
        return resultSet;
    }

    public int executeUpdateStatement(String statementStr) {
    int execution = 0; // Initialising the execution result with a default value
    try {
        statement = connection.createStatement();
        execution = statement.executeUpdate(statementStr);
    } catch (SQLException ex) {
        Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("Cannot execute statement");
    }

    return execution; // Return the execution result
}
    public ResultSet executeStatement(String statementString){
            Statement statement;
            ResultSet result = null;
            
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(statementString);
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        return result;
    }

    public String processResultSet(ResultSet rs) {
        String temp = "";
        try {
            ResultSetMetaData meta = rs.getMetaData();
            int size = meta.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= size; i++) {
                    Object value = rs.getObject(i);
                    temp += "#" + value;
                }
                temp += "\n";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return temp;
    }
//}

    public static void main(String[] args) {
        // Creating an instance of the DB class
       DB db = new DB();

        try {
            
            String sql = "SELECT Username FROM CompetitorRegistrationInfo";
             
            Statement statement = db.connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
             
            while (result.next()) {
                
                String Username = result.getString("Username");
                
                 
                System.out.println(Username);
            }
            // Example usage of executeQuery
            ResultSet resultSet = db.executeQuery("SELECT * FROM your_table");
            
            
            
            //String result = db.processResultSet(resultSet);
            System.out.println(result);

            // Example usage of executeStatement
            int rowsUpdated = db.executeUpdateStatement("UPDATE your_table SET column1 = 'New Value' WHERE condition");
            System.out.println("Rows updated: " + rowsUpdated);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Close the database connection when done
        db.closeConnection();
    }
}


//    private Connection conn;
//    private PreparedStatement statement;
//    private ResultSet resultSet;
//
//    public DB()
//    {
//          try  {    
//            conn = DriverManager.getConnection(url);
//            
//        } catch (SQLException ex)
//        {
//            System.out.println("Cannot connect");
//        }       
//    }
//    
//    
//
//    public void update(String update) throws SQLException
//    {
//        statement = conn.prepareStatement(update);
//        statement.executeUpdate();
//        statement.close();
//    }
//
//    public ResultSet query(String stmt) throws SQLException
//    {
//        statement = conn.prepareStatement(stmt);
//        resultSet = statement.executeQuery();
//        return resultSet;
//    }
//
//    public String processResultSet(ResultSet rs)
//    {
//        String temp = "";
//        try
//        {
//            ResultSetMetaData meta = rs.getMetaData();
//            int size = meta.getColumnCount();
//            while (rs.next())
//            {
//                for (int i = 1; i <= size; i++)
//                {
//                    Object value = rs.getObject(i);
//                    temp += "#" + value;
//                }
//                temp += "\n";
//            }
//        } catch (SQLException ex)
//        {
//            ex.printStackTrace();
//        }
//        return temp;
//    }
//}

