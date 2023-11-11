// Author: Chris Fietkiewicz. 
import javafx.scene.control.*;

public class ExampleScene extends SceneMaker {
	public ExampleScene(String titleText) {
        super(titleText);
        TextField input = addTextField();
        addButton("Button", () -> action(input));
		Label newLab = addLabel();
		addButton("newButton", () -> setlabelText(input, newLab));
		

	}
    
    public static void action(TextField input) {
    	System.out.println(input.getText());
    }
    
    
    public static void setlabelText(TextField T, Label L ) {
    	
    	String text = T.getText();
    	L.setText(text);
    }
    
       
}



//Modify ExampleScene.java as described below:
//• Add a method that receives a TextField and a Label. It should set the Label text to whatever is in
//the TextField. This is similar to the action method in the sample code, except that it must use
//setText to change the Label.
//• Add a Label using the new “addLabel” method in SceneMaker.java.
//• Add a Button using the existing “addButton” method, and pass the proper lambda expression to
//call the new method you created for changing the Label text.
//Below is an example