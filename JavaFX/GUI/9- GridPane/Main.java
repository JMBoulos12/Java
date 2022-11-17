/*
 * @author Jean Marc Boulos
 * @since 15/11/2022
 */
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
    window.setTitle("JMB - JavaFX");
    
    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10, 10, 10, 10));
    grid.getVgap(0);
    grid.getHgap(10);
    
    // Name label
    Label nameLabel = new Label ("Username: ");
    GridPane.setConstraints(nameLabel, 0, 0);
    
    //Name input
    TextField nameInput = new TextField("JM");
    GridPane.setConstraints(nameInput, 1, 0);
    
    // Password label
    Label passLabel = new Label("Password: ");
    GridPane.getConstraints();
    
    // Password input
    TextField passInput = new TextField();
    passInput.setPromptText("Password");
    GridPane.setConstraints(passInput, 1, 1);
    
    Button loginButton = new Button("Log In");
    GridPane.setConstraints(loginButton, 1, 2);
    
    grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
    
    Scene scene = new Scene(grid, 300, 200);
    window.setScene(scene);
    window.show();
  }
  
  
}
