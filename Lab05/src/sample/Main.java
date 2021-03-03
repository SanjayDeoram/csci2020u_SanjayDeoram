package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Date;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage window = primaryStage;
        primaryStage.setTitle("Lab05 Solutions");
        TableView<StudentRecord> table;
        //Student id col
        TableColumn<StudentRecord,String> studentIDCol = new TableColumn<>("SID");
        studentIDCol.setMinWidth(300);
        studentIDCol.setCellValueFactory(new PropertyValueFactory<>("studentID"));

        TableColumn<StudentRecord,Float> assignmentsCol = new TableColumn<>("Assignments");
        assignmentsCol.setMinWidth(300);
        assignmentsCol.setCellValueFactory(new PropertyValueFactory<>("assignments"));

        TableColumn<StudentRecord,Float> midtermCol = new TableColumn<>("Midterm");
        midtermCol.setMinWidth(300);
        midtermCol.setCellValueFactory(new PropertyValueFactory<>("midterm"));

        TableColumn<StudentRecord,Float> examCol = new TableColumn<>("Final Exam");
        examCol.setMinWidth(300);
        examCol.setCellValueFactory(new PropertyValueFactory<>("exam"));

        TableColumn<StudentRecord,Float> finalMarkCol = new TableColumn<>("Final Mark");
        finalMarkCol.setMinWidth(300);
        finalMarkCol.setCellValueFactory(new PropertyValueFactory<>("finalMark"));

        TableColumn<StudentRecord,String> letterCol = new TableColumn<>("Letter Grade");
        letterCol.setMinWidth(300);
        letterCol.setCellValueFactory(new PropertyValueFactory<>("letterGrade"));
        table = new TableView<>();
        table.setItems(DataSource.getAllMarks());
        table.getColumns().addAll(studentIDCol,assignmentsCol,midtermCol,examCol,finalMarkCol,letterCol);


        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);


        grid.getChildren().addAll(table);
        Scene scene = new Scene(grid,800,800);

        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);


    }
}
