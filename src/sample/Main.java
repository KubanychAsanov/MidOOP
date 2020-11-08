package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("views/sample.fxml"));
        primaryStage.setTitle("My App");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }


    public static void main(String[] args) throws IOException {
        launch(args);
//        String url ="jdbc:sqlserver://localhost; databaseName=db_dentist";
//        String user = "SA";
//        String password = "k78964545K";
//
//        try {
//            Connection connection = DriverManager.getConnection(url,user, password);
//            System.out.println("Yes Kuba You did it, CONNECTED!!!");
//        } catch (SQLException throwables) {
//            System.out.println("OLDU ");
//            throwables.printStackTrace();
//        }
    }
}
