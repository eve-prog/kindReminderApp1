package com.team;

import com.team.model.Event;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.awt.*;

public class Main extends Application {

    public static void main(String[] args) {

        Event event = new Event(1, "party", "Epic Saturday", null);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kindReminderApp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Connected succesfully");

        Main.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("first_window.fxml"));
        primaryStage.setTitle("Kind reminder app");
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();
    }


}
