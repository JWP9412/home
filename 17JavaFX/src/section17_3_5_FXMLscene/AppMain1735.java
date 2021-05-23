package section17_3_5_FXMLscene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain1735 extends Application {
	@Override
	public void start(Stage ps) throws Exception{
		Parent root =FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		ps.setTitle("FXML");
		ps.setScene(scene);
		ps.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
