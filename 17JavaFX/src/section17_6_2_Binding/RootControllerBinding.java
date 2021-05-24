package section17_6_2_Binding;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class RootControllerBinding implements Initializable {
	@FXML private TextArea ta1;
	@FXML private TextArea ta2;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Bindings.bindBidirectional(ta1.textProperty(), ta2.textProperty());
		
	}
}
