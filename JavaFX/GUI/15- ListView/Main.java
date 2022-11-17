/*
 * @author Jean Marc Boulos
 * @since 17/11/2022
 */
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ListView;

public class Main extends Application {
  
  Stage window;
  Scene scene;
  Button button;
  ListView<String> listView;
  
  public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("JMB");
    button = new Button("Submit");
    
    listView = new ListView<>();
    listView.getItems().addAll("Iron Man", "Contact", "Surrogates");
    listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    
    button.setOnAction(e -> buttonClicked());
    
    VBox layout = new VBox(10);
    layout.setPadding(new Insets(20, 20, 20, 20));
    layout.getChildren().addAll(button);
    
    scene = new Scene(layout, 300, 250);
    window.getScene(scene);
    window.show();
  }
  
  // Print out movies
  private void buttonClicked() {
    String message = "";
    ObservableList<String> movies;
    movies = listView.getSelectionModel().getSelectedItems();
    
    for(String m: movies) {
      message += m + "\n";
    }
    
    System.out.println(message);
  }
  
}
