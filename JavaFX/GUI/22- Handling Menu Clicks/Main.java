BorderPane layout;

public static void main(String[] args) {
  launch(args);
}
@Override
public void start(Stage primaryStage) throws Exception {
  window = primaryStage;
  winddow.setTitle("JMB");
  
  // File menu
  Menu filemenu = new Menu("File");
  
  // Menu items
  MenuItem newFile = new MenuItem("New...");
  newFile.setOnAction(e -> System.out.println("Create a new file..."));
  fileMenu.getItems().add(newFile);
  
  fileMenu.getItems().add(new MenuItem("New..."));
  fileMenu.getItems().add(new MenuItem("Open..."));
  fileMenu.getItems().add(new MenuItem("Save..."));
  fileMenu.getItems().add(new SeparatorMenuItem());
  fileMenu.getItems().add(new MenuItem("Settings..."));
  fileMenu.getItems().add(new SeparatorMenuItem());
  fileMenu.getItems().add(new MenuItem("Exit..."));
  
  // Exit Menu
  Menu editMenu = new Menu("_Edit");
  editMenu.getItems().add(new MenuItem("Cut"));
  editMenu.getItems().add(new MenuItem("Copy"));
  
  MenuItem newFile = new MenuItem("Paste");
  newFile.setOnAction(e -> System.out.println("Pasting some things"));
  paste.setDisable(true);
  editMenu.getItems().add(paste);
  
  // Main Menu bar
  MenuBar menuBar = new MenuBar();
  menuBar.getMenus().addAll(fileMenu);
  
  layout = new BorderPane();
  layout.getTop(menuBar);
  
  Scene scene = new Scene(layout, 400, 300);
  window.setScene(scene);
  window.show();
}
