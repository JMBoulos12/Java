/*
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

public class Main extends Appication {
  
  Button button;
  
  public static void main(String[] args){
    launch(args); 
  }
  
  @override
  public static start(Stage primaryStage) throws Exception{
    primaryStage.setTitle("Title of the windows");
    button = new Button();
    button.setText("Click me");
    
    StackPane layout = new StackPane();
    layout.getChildren().add(button);
    
    Scene scene = new Scene(layout, 300, 250);
    primaryStage..getScene(scene);
    primaryStage.show();
  }
  
}
