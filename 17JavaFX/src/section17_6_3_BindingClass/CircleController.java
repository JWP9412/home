package section17_6_3_BindingClass;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class CircleController implements Initializable{
	@FXML private AnchorPane rootCircle;
	@FXML private Circle circle;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		circle.centerXProperty().bind(Bindings.divide(rootCircle.widthProperty(), 2));
		circle.centerYProperty().bind(Bindings.divide(rootCircle.widthProperty(), 2));
		
	}
	
	
}
