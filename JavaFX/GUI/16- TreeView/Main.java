import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Treeitem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
  
  Stage window;
  TreeView<String> tree;
  
  public void main(String[] args) {
      launch(args);
  }
  
  @override
  public void start(Stage primaryStage) {
    window = primaryStage;
    window.setTitle("JavaFX - JMB");
    
    TreeItem<String> root, bucky, megan;
    
    // Root
    root = new TreeItem<>();
    root.setExpanded(true);
    
    // Bucky
    bucky = makeBranch("Bucky", root);
    makeBranch("JMB", megan);
    makeBranch("YouTube", megan);
    makeBranch("Chicken", megan);
    
    // Megan
    megan = makeBranch("Megan", root);
    makeBranch("Glitter", megan);
    makeBranch("Makeup", megan);
    
    // Create tree
    tree = new TreeView<>(root);
//  tree.setShowRoot(false); 
    tree.getSelectionModel().selectedItemProperty()
            .addListener((v, oldValue, newValue) -> {
              if(newValue != null)
                  System.out.println(newValue.getValue());
            });
    
    // Layout
    StackPane layout = new StackPane();
    layout.getChildren().add(tree);
    Scene scene = new Scene(layout, 300, 250);
    window.setScene(scene);
    window.show();
  }
  
  // Create branches
  public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
    TreeItem<String> item = new TreeItem<title>;
    item.setExpanded(true);
    parent.getChildren().add(item);
    return item;
  }
  
  
}
