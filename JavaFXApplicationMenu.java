import javafx.application.Application;
import javafx.scene.Scene;  
import javafx.scene.control.Menu;  
import javafx.scene.control.MenuBar;  
import javafx.scene.control.MenuItem;  
import javafx.scene.control.TextField; 
import javafx.scene.layout.BorderPane;  
import javafx.stage.Stage;  
import javafx.event.ActionEvent;  
import javafx.event.EventHandler; 
public class JavaFXApplicationMenu extends Application {  
@Override  
public void start(Stage stage) {  
MenuBar menuBar = new MenuBar();  
Menu fileMenu = new Menu("File");  
Menu editMenu = new Menu("Edit");  
Menu helpMenu = new Menu("Help");  
MenuItem newItem = new MenuItem("New");  
MenuItem openFileItem = new MenuItem("Open File");  
MenuItem exitItem = new MenuItem("Exit"); 
MenuItem copyItem = new MenuItem("Copy");  
MenuItem pasteItem = new MenuItem("Paste");  
fileMenu.getItems().addAll(newItem, openFileItem, exitItem);  
editMenu.getItems().addAll(copyItem, pasteItem);  
menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);  
TextField messageField = new TextField(); 
messageField.setPromptText("Messages will appear here..."); 
newItem.setOnAction(new EventHandler<ActionEvent>() { 
@Override 
public void handle(ActionEvent event) { 
messageField.setText("New file clicked"); 
} 
}); 
exitItem.setOnAction(new EventHandler<ActionEvent>() { 
@Override 
public void handle(ActionEvent event) { 
stage.close(); 
} 
}); 
BorderPane root = new BorderPane();  
root.setTop(menuBar);  
root.setCenter(messageField); 
Scene scene = new Scene(root, 350, 200);  
stage.setTitle("JavaFX Menu Example (No Lambda)");  
stage.setScene(scene);  
stage.show();  
}  
public static void main(String[] args) {  
Application.launch(args);  
}  
} 