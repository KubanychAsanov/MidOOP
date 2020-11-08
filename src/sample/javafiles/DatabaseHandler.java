package sample.javafiles;

import sample.javafiles.Configs;
import sample.javafiles.Const;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DatabaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException{
        String connectionString = "jdbc:sqlserver://" + dbHost + "; databaseName = " + dbName;

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }
    public void signUpUser(String firstName, String lastName, String userName, String password, String gender){
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" + Const.USERS_FIRSTNAME + "," +Const.USERS_LASTNAME
                + "," + Const.USERS_LOGIN + "," + Const.USERS_PASS + "," + Const.USERS_GENDER + ")"
                + "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, firstName);
            prSt.setString(2, lastName);
            prSt.setString(3, userName);
            prSt.setString(4, password);
            prSt.setString(5, gender);

            prSt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
