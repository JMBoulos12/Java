/*
 * @author Jean Marc Boulos
 * @since 11/11/2022
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
  
  Stage window;
  Button button;
  
  public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public void start(Stage primaryStage) {
    window = primaryStage;
    window.setTitle("JMB");
    
    button = new Button("Click Me");
    button.setOnAction(e -> AlertBox.display("Title of window", "Nox this alert box is awesome!");
    
    StackPane layout = new StackPane();
    layout.getChildren().add(button);
    Scene scene = new Scene(layout, 300, 250);
    window.setScene(scene);
    window.show();
  }
}
