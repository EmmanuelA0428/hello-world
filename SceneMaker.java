// Author: Chris Fietkiewicz. 
import java.io.PrintWriter;
import java.net.Socket;

import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import javafx.application.Application; // For launch()

public class SceneMaker {
	private Stage stage;
	private Scene scene;
	protected VBox root = new VBox();
//	protected ArrayList<>;
//	MakerInterface func;

	public SceneMaker(String titleText) {
        Label title = new Label(titleText);
        title.setFont(new Font(40));
        root.getChildren().addAll(title);
        root.setAlignment(Pos.TOP_CENTER);
        scene = new Scene(root, 450, 350);
	}
	
	public TextField addTextField() {
		TextField t = new TextField("text");
		root.getChildren().addAll(t);
		return t;
	}
	
	public void addButton(String text, MakerInterface func) {
		Button b = new Button(text);
		b.setOnAction(e -> func.doSomething());
		root.getChildren().addAll(b);
	}

	// Return reference to this scene
	public Scene getScene() {
        return scene;
	}
	
	public Label addLabel() {
		Label newLab = new Label();
		newLab.setText("New Label");
		root.getChildren().addAll(newLab);
		return newLab;
	}
}
//Add a new “addLabel” method to SceneMaker.java that does the following:
//• Creates a new Label. You may create it with no text or some default text.
//• Adds the Label to root.
//• Returns the reference for the new Label. This will be used later
