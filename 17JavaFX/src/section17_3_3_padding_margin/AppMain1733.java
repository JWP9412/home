package section17_3_3_padding_margin;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain1733 extends Application {
	@Override
	public void start(Stage ps) throws Exception {
		// 패딩설정
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(50, 10, 10, 50));
		Button btn = new Button();
		btn.setPrefSize(100, 100);

		// 마진 설정
		/*
		 * Hbox hbox = new HBox(); 
		 * Button btn = new Button(); 
		 * btn.setPrefSize(100, 100);
		 * HBox.setMargin(btn, new Insets(10, 10, 50, 50));
		 */
		
		hbox.getChildren().add(btn);
		
		Scene scene = new Scene(hbox);
		
		ps.setTitle("margin,padding");
		ps.setScene(scene);
		ps.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
