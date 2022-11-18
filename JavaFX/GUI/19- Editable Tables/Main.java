import javafx.application.Application;
import javafx.collection.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
  
  Stage window;
  TableView<Product> table;
  TextField nameInput, priceInput, quantityInput;
}

public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("JMB - Javafx");
    
    // Name column
    TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
    nameColumn.setMinWidth(200);
    nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
    
    // Price column
    TableColumn<Product, String> nameColumn = new TableColumn<>("Price");
    nameColumn.setMinWidth(100);
    nameColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
    
    // Quantity column
    TableColumn<Product, String> nameColumn = new TableColumn<>("Quantity");
    nameColumn.setMinWidth(100);
    nameColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
    
    // Name input
    nameInput = new TextField();
    nameInput.setPromptText("Name");
    name.Input.setMinWidth(100);
    
    // Price input
    nameInput = new TextField();
    priceInput.setPromptText("Price");
    
    // Quantity input
    nameInput = new TextField();
    nameInput.setPromptText("Quantity");
    
    // Button
    Button addButton = new Button("Add");
    Button deleteButton = new Button("Delete");
    
    HBox hBox = new HBox();
    hBox.setPadding(new Insets(10, 10, 10, 10));
    hBox.setSpacing(10);
    hBox.getChildren().addAll(nameInput, priceInput, addButton, deleteButton);
    
    table = new TableView<>();
    table.setItems(getProduct());
    table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);
    
    VBox vbox = new VBox():
    vbow.getChildren().addAll();
    
    Scene scene = new Scene(vbox);
    window.setScene(scene);
    window.show();
  }
  
  // Get all the products
  public ObservanleList<Product> getProduct() {
    ObservableList<Product> products = FXCollection.observableArrayList();
    products.add(new Product("Laptop", 859.00, 20));
    products.add(new Product("Bouncy Ball", 2.49, 190));
    products.add(new Product("Toilet", 99.00, 74));
    products.add(new Product("The Notebook DVD", 19.99, 12));
    products.add(new Product("Corn", 1.49, 856));
    return products;
  }
