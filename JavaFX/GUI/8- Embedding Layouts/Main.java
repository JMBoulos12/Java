/*
 * @author Jean Marc Boulos
 * @since 14/11/2022
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.Hbox;
import javafx.stage.Vbox;

public class main extends Application {
  
  Stage window:
  
  public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public static void start(Stage primaryStage) throws Exception {
    window = primaryStagel;
    window.setTitle("JMB");
    
    
    HBox topMenu = new HBox();
    Button buttonA = new Button("File");
    Button buttonB = new Button("Edit");
    Button buttonC = new Button("View");
    topMenu.getChildren().addAll(buttonA, buttonB, buttonC);
    
    HBox leftMenu = new VBox();
    Button buttonA = new Button("D");
    Button buttonB = new Button("E");
    Button buttonC = new Button("F");
    topMenu.getChildren().addAll(buttonD, buttonE, buttonF);
    
    BorderPane borderPane = new BorderPane();
    borderPane.setTop(topMenu);
    borderPane.setLeft(leftMenu);
    
    Scene scene = new Scene(layout, 300, 250);
    window.setScene (scene);
    window.show();
  }
  
  
}
