import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10, 
            new Label("Hello, JavaFX!"),
            new Label("Java Version: " + System.getProperty("java.version")),
            new Label("JavaFX Version: " + System.getProperty("javafx.runtime.version"))
        );

        stage.setScene(new Scene(root, 300, 150));
        stage.setTitle("Hello JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
