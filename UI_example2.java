/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs211_gproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.*; 
import javafx.scene.text.*; 
import javafx.geometry.*; 
import javafx.scene.layout.*; 
import javafx.scene.shape.*; 


/**
 *
 * @author chanchen
 */
public class CS211_GProject extends Application {
    Scene scene1, scene2;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        // set title for the stage
        stage.setTitle("GMU Computer Science Major Scheduler");
        
        //create TextFlow
        TextFlow text_flow = new TextFlow();
        //create text
        Text text_1 = new Text("Class Scheduler\n");
        //set the text color
        text_1.setFill(Color.GREEN);
        // set the font of the text
        text_1.setFont(Font.font("Verdana", 30));
        
        //create text
        Text text_2 = new Text("GMU Computer Science Majors Only\n");
        
       //set the text color
       text_2.setFill(Color.BLACK);
       //set the font of the text
       text_2.setFont(Font.font("Helvetica",20));
       
      //add text to textflow
      text_flow.getChildren().add(text_1);
      text_flow.getChildren().add(text_2);
      
      //set text Alignment
      text_flow.setTextAlignment(TextAlignment.CENTER);
      //set line spacing
      text_flow.setLineSpacing(15.0f);
      
      //create TextFlow
        TextFlow text_flow2 = new TextFlow();
        //create text
        Text text_3 = new Text("This program is a tool to help you find what classes you can take this upcoming semester.\n");
        //set the text color
        text_3.setFill(Color.BLACK);
        // set the font of the text
        text_3.setFont(Font.font("Verdana", 15));
    
        text_flow2.getChildren().add(text_3);
        text_flow2.setTextAlignment(TextAlignment.JUSTIFY);
      
      
      //create VBox
      VBox vbox = new VBox(text_flow,text_flow2);
      
      //set alignment of vbox
      vbox.setAlignment(Pos.CENTER);
     
      
      Button button1 = new Button("Start");
      button1.setOnAction(e -> stage.setScene(scene2));
      vbox.getChildren().addAll(button1);
      
      scene1 = new Scene(vbox, 400,300);
      
        
      //Label label1= new Label("This program is a tool to help you find what classes you can take this upcoming semester.");
      //Button button1= new Button("Start");
      //button1.setOnAction(e -> stage.setScene(scene2));
      //VBox layout1 = new VBox(20);
      //layout1.getChildren().addAll(vboxlabel1, button1);
      

//Scene 2
        Label label2= new Label("Enter all of the classes you have taken and passed with a C:");
        label2.setWrapText(true);
        Button button2= new Button("Yes");
        button2.setOnAction(e -> stage.setScene(scene1));
        VBox layout2= new VBox(20);
        layout2.getChildren().addAll(label2,button2);
        scene2= new Scene(layout2,300,250);
        
       
        
        stage.setScene(scene1);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
