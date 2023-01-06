package 27- CSS Custom Style and Selectors;

import javafx.application.Application;
import javafx.geometry.Insets;
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

    // GridPane with 10px padding around edge
    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10, 10, 10, 10));
    grid.setVgap(8);
    grid.setHgap(10);

    // Name label - constrains use (child, column, row)
    Label nameLabel = new Label("Username: ");
    nameLabel.setId("bold-label");
    GridPane.setConstraints(nameLabel, 0, 0);

    // Name input
    TextField nameInput = new TextField("Bucky");
    GridPane.setConstraints(nameInput, 1, 0);

    // Password Label
    Label passLabel = new Label("Password: ");
    GridPane.setConstraints(passLabel, 0, 1);

    // Password Input
    TextField passInput = new TextField();
    passInput.setPromptText("Insert Password HERE");
    GridPane.setConstraints(passInput, 1, 1);

    // Login
    Button loginButton = new Button("Log in");
    GridPane.setConstraints(loginButton, 1, 2);
    
    // Sign up
    Button signUpButton = new Button("Sign Up");
    signUpButton.getStyleClass().add("button-blue");
    GridPane.setConstraints(signUpButton, 1, 3);

    // Add everything to grid
    grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);

    Scene scene = new Scene(grid, 300, 200);
    scene.getStylesheets();
    window.setScene(scene);
    window.show();
  }
    
}
