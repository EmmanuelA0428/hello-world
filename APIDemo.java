// Author: Chris Fietkiewicz.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class APIDemo extends Application {
    public void start(Stage stage) {
    	ExampleScene s = new ExampleScene("API Demo");
    	stage.setScene(s.getScene());
        stage.show();
    } // end start();
    
    public static void main(String[] args) {
        launch(args);  // Run this Application.
    }
}