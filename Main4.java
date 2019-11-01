import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class Main4 extends Application{
   
   Stage window;
   Scene scene1;
   Button button;
   
   public static void main(String[]args){
      launch(args);
   }
      
   public void start(Stage primaryStage) throws Exception{
      window = primaryStage;
      window.setTitle("window title goes here");
      
      button = new Button("click me");
      
      ChoiceBox<String> choiceBox = new ChoiceBox<>();
      choiceBox.getItems().addAll(
      "CDS 130",
      "COMM 100",
      "CS 101",
      "CS 105",
      "CS 110",
      "CS 112",
      "CS 211",
      "CS 222",
      "CS 310",
      "CS 321",
      "CS 330",
      "CS 351",
      "CS 367",
      "CS 421",
      "CS 465",
      "CS 483", 
      "ECE 10",
      "ECE 28",
      "ECE 285",
      "ECE 301",
      "ECE 331",
      "ECE 332",
      "ECE 445",
      "ENGH 302",
      "HNRS 110",
      "HNRS 122",
      "HNRS 130",
      "HNRS 131",
      "HNRS 230", 
      "HNRS 240",
      "MATH 104",
      "MATH 108",
      "MATH 113",
      "MATH 114",
      "MATH 116",
      "MATH 123",
      "MATH 124",
      "MATH 125",
      "MATH 203",
      "MATH 351",
      "PHIL 173",
      "PHYS 261",
      "STAT 334",
      "STAT 344",
      "STAT 346",
      "STAT 362",
      "SWE 321",
      "SWE 421",
      "SYST 210",
      "SYST 330");
      
      button.setOnAction(e -> getChoice(choiceBox));
      
      VBox layout = new VBox(10);
      layout.setPadding(new Insets(20,20,20,20));
      layout.getChildren().addAll(choiceBox,button);
      //makes scene 1 the default
      
      scene1 = new Scene (layout, 300, 250);
      window.setScene(scene1);
      window.show();  
   }
   
   private void getChoice(ChoiceBox<String> list){
      String selected = list.getValue();
      System.out.println(selected);}

}

