import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
  
  Stage window;
  Scene scene;
  Button button;
  
  public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("Checkbox Example");
    
    // Checkboxes
    CheckBox box1 = new CheckBox("Bacon");
    CheckBox box1 = new CheckBox("Tuna");
    box2.setSelected(true);
    
    // Button
    button = new Button ("Order Now!");
    
    // Layout
    VBox layout = new VBox(10);
    layout.setPadding(new Insets(20, 20, 20, 20));
    layout.getChildren().addAll(box1, box2, button);
    
    scene = new Scene(layout, 300, 250);
    window.setScene(scene);
    window.show();
  }
}
