


@Override
public void start(Stage primaryStage) throws Exception {
  window = primaryStage;
  window.setTitle("JMB");

  // File menu
  Menu fileMenu =  new Menu("File");
  newFile.setOnAction(e -> System.println("Create a new file..."));
  fileMenu.getItems().add(newFile);
  fileMenu.getItems().add(new MenuItem("Open..."));
  fileMenu.getItems().add(new MenuItem("Save..."));
  fileMenu.getItems().add(new SeparatorMenuItem());
  fileMenu.getItems().add(new MenuItem("Settings..."));
  fileMenu.getItem().add(new SeparatorMenuItem());
  fileMenu.getItems().add(new MenuItem("Exit..."));

  // Edit menu
  Menu editMenu = new Menu("_Edit");
  editMenu.getItems().add(new MenuItem("Cut"));
  editMenu.getItems().add(new MenuItem("Copy"));
  MenuItem paste = new MenuItem("Paste");
  paste.setOnAction(e -> System.out.println("Pasting things"));
  paste.setDisable(true);
  editMenu.getItems().add(paste);

  // Help menu
  Menu helpMenu = new Menu("Help");
  CheckMenuItem showLines = new CheckMenuItem("Show line numbers");
    if(showLines.isSelected())
        System.out.println("Program will now display line numbers");
    else
        System.out.println("Hiding line number");
  });
  CheckMenuItem autoSave = new CheckMenuItem("Enable AutoSave");
  autoSave.setSelected(true);
  helpMenu.getItems().addAll(fileMenu, editMenu, helpMenu);
  
  // Main menu bar
  MenuBar menuBar = new MenuBar();
  menuBar.getMenus().addAll(fileMenu, editMenu);

  layout = new BorderPane();
  layout.setTop(menuBar);
  Scene scene = new Scene(layout, 400, 300);
  window.setScene(scene);
  window.Show();
}
}