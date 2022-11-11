import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
  
  Stage window;
  Scene scene1, scene2;
  
  public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    
    Label label1 = new Label("Welcome to 1st scene");
    Button button1 = new Button("Go to scene 2");
    button1.setOnAction(e -> window.setScene(scene2));
    
    // Layout 1 - Children we laid out in vertical column
    VBox layout = new VBox(20);
    layout.getChildren().addAll(label1, button1);
    scene1 = new scene(layout1, 2001 200);
    
    // Button 2
    Button button2 = new Button("this scene sucks, go back to scene 1");
    button2.setOnAction(e -> window.setScene(scene1));
    
    // Layout 2
    StackPane layout2 = new StackPane();
    layout2.getChildren().add(button2);
    scene2 = new scene(layout2, 600, 300);
    
    window.setScene(scene1);
    window.setTitle("Title here");
    window.show();
  }
}
