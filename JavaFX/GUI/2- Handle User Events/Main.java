/**
 * @author Jean Marc Boulos
 * @since 11/11/2022
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/* 10/11/2022 */

public class Main extends Appication implements EventHandler<ActionEvent> {
  
  Button button;
  
  public static void main(String[] args){
    launch(args); 
  }
  
  @override
  public static start(Stage primaryStage) throws Exception{
    primaryStage.setTitle("Title of the windows");
    button = new Button();
    button.setText("Click me"); 
    button.setOnAction(this);
    
    StackPane layout = new StackPane();
    layout.getChildren().add(button);
    
    Scene scene = new Scene(layout, 300, 250);
    primaryStage..getScene(scene);
    primaryStage.show();
  }
  
  @Override
  public void handle(ActionEvent event) {
    if(event.getSource() == button) {
      System.out.println("Ohh, did you saw that bird?");
    }
    if(event.getSource() == button2) {
      System.out.println("You clicked button 2");
    }
  }
  
}
