/**
 * @author Jean Marc Boulos
 * @since 11/11/2022
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<> {
  
  Button button;
  
  public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Title");
    button = new Button();
    button.setText("Hey");
    
    // This class will handle the button events
    button.setOnAction(e -> System.out.println("hi rabbit");
    
    StackPane layout = new StackPane();
    layout.getChildren().add(button);
    Scene scene = new Scene(layout, 300, 250);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
                       
}
