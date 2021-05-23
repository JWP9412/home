package section17_2_1_mainClass;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		primaryStage.show(); // 윈도우 보여주기
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
