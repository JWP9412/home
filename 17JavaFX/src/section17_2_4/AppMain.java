package section17_2_4;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage ps) throws Exception{
		VBox root = new VBox();
		root.setPrefWidth(400);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		
		Label label = new Label();
		label.setText("녕안, 자바FX JWP");
		label.setFont(new Font(50));
		
		Button btn = new Button();
		btn.setText("확인");
		btn.setOnAction(event->Platform.exit());
		
		root.getChildren().add(label);
		root.getChildren().add(btn);
		
		Scene scene = new Scene(root);
		
		ps.setTitle("App Main");
		ps.setScene(scene);
		ps.show();
	}
	public static void main(String[] args) {
		launch(args);

	}

}
