import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentFormApp extends Application {
    @Override
    public void start(Stage stage) {
        TextField name = new TextField(), roll = new TextField();
        name.setPromptText("Name"); roll.setPromptText("Roll No");

        RadioButton male = new RadioButton("Male"), female = new RadioButton("Female");
        ToggleGroup gender = new ToggleGroup(); male.setToggleGroup(gender); female.setToggleGroup(gender);

        ComboBox<String> dept = new ComboBox<>();
        dept.getItems().addAll("CSE","ECE","MECH","CIVIL"); dept.setPromptText("Department");

        Button submit = new Button("Submit");
        TextArea output = new TextArea(); output.setEditable(false);

        submit.setOnAction(e -> {
            RadioButton g = (RadioButton)gender.getSelectedToggle();
            output.setText("Name: "+name.getText()+"\nRoll: "+roll.getText()+
                           "\nGender: "+(g==null?"Not Selected":g.getText())+
                           "\nDepartment: "+(dept.getValue()==null?"Not Selected":dept.getValue()));
        });

        VBox root = new VBox(10, name, roll, male, female, dept, submit, output);
        stage.setScene(new Scene(root, 300, 300));
        stage.setTitle("Student Form"); stage.show();
}
	public static void main(String[] args) { 
		launch(args); 
	}
}
