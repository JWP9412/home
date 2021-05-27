package section17_7_2_InputControl;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class InputController implements Initializable {
	@FXML private TextField txtTitle;
	@FXML private PasswordField txtPassword;
	@FXML private ComboBox<String> comboPublic;
	@FXML private DatePicker dateExit;
	@FXML private TextArea txtContent;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	
	public void handleBtnRegAction(ActionEvent e) {
		String title = txtTitle.getText();
		System.out.println("title : "+title);
		
		String pw = txtPassword.getText();
		System.out.println("password : "+ pw);
		
		String strPublic = comboPublic.getValue();
		System.out.println("dateExit : "+ strPublic);
		
		LocalDate localDate = dateExit.getValue();
		if(localDate != null) {
			System.out.println("dateExit : " + localDate.toString());
		}
		
		String content = txtContent.getText();
		System.out.println("content : "+ content);
	}
	
	public void handleBtnCancleAction(ActionEvent e) {
		Platform.exit();
	}
}
