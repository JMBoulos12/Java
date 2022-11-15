import javafx.application.Application;
import javafx.geometry.Insests;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {
  
  Stage window;
  
  public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("JMB");
    
    // Form
    TextField nameInput = new TextField();
    
    button = new Button("Click me");
    button.setOnAction( e -> isInt(nameInput, nameInput.getText()) );
    
    // Layout
    VBox layout = new VBox(10);
    layout.setPadding(new Insets(20, 20, 20, 20));
    layout.getChildren().addAll(nameInput, button);
    
    scene = new Scene(layout, 300, 250);
    window.setScene(scene);
    window.show();
  }
  
  private boolean isInt (TextField input, String message) {
    try {
      int age = Integer.parseInt(input.getText());
      System.out.println("User is: "+ age);
      return true;
    } catch(NumberFormatException e){
      System.out.println("Error: " + message + " is not a number");
      return false;
    }
  }
    
}
