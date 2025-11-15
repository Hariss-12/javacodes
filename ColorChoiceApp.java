import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class ColorChoiceApp extends Application {
@Override
public void start(Stage primaryStage) {
Label label = new Label("Select a color:");
ChoiceBox<String> colorChoiceBox = new ChoiceBox<>();
colorChoiceBox.getItems().addAll("Red","Green","Blue","Yellow","Orange");
colorChoiceBox.getSelectionModel().selectedItemProperty().addListener((obs,oldVal,newVal) -> {
if(newVal!=null) label.setText("Selected color: "+newVal);
});
VBox root = new VBox(10,colorChoiceBox,label);
root.setStyle("-fx-padding:20;-fx-alignment:center;");
primaryStage.setScene(new Scene(root,300,150));
primaryStage.setTitle("Color ChoiceBox Example");
primaryStage.show();
}
public static void main(String[] args) {
launch(args); }
}
