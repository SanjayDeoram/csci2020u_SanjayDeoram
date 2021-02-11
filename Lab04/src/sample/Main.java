package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.awt.*;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Date;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage window = primaryStage;
        primaryStage.setTitle("Registration");
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);
        //Name
        Label name = new Label("Username:");
        TextField name_field = new TextField();
        GridPane.setConstraints(name,0,0);
        GridPane.setConstraints(name_field,1,0);
        //Password
        Label password = new Label("Password:");
        PasswordField password_field = new PasswordField();
        password_field.setPromptText("password");
        GridPane.setConstraints(password,0,1);
        GridPane.setConstraints(password_field,1,1);

        //Full Name
        Label fullname = new Label("Full Name:");
        TextField fullname_field = new TextField();
        GridPane.setConstraints(fullname,0,2);
        GridPane.setConstraints(fullname_field,1,2);

        //Email
        Label email= new Label("E-Mail:");
        TextField email_field = new TextField();
        GridPane.setConstraints(email,0,3);
        GridPane.setConstraints(email_field,1,3);

        //Phone
        Label phone= new Label("Phone #:");
        TextField phone_field = new TextField();
        phone_field.setPromptText("Phone #");
        GridPane.setConstraints(phone,0,4);
        GridPane.setConstraints(phone_field,1,4);

        //Date
        Label dateLabel= new Label("Date of Birth:");
        DatePicker datePicker = new DatePicker();
        GridPane.setConstraints(dateLabel,0,5);
        GridPane.setConstraints(datePicker,1,5);

        datePicker.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                LocalDate date = datePicker.getValue();
            }
        });
        Button register =new Button("Register");
        register.setOnAction(actionEvent -> {
            System.out.println("Name: " +name_field.getText() +  "\nPassword:" + password_field.getText() + "\nFullName:" +fullname_field.getText());
            System.out.println("Email:"  + email_field.getText() + "\nPhone :" +phone_field.getText() + "\nDateOB:" + datePicker.getValue());
        });

        GridPane.setConstraints(register,1,6);

        grid.getChildren().addAll(name,name_field,password,password_field,fullname,fullname_field,email,email_field,phone,phone_field,dateLabel,datePicker,register);
        Scene scene = new Scene(grid,800,800);

        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
