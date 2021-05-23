package section17_5_1_EventHandler;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain1751 extends Application{
	@Override
	public void start(Stage ps) throws Exception{
		HBox root = new HBox();
		root.setPrefSize(200, 50);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		
		Button btn1 = new Button("버튼1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("버튼1 클릭");
			}
		});
		
		Button btn2 = new Button("버튼2");
		btn2.setOnAction(event->System.out.println("버튼2 클릭"));
		
		root.getChildren().addAll(btn1,btn2);	//HBox에 btn1,btn2를 추가
		Scene scene = new Scene(root);
		
		ps.setTitle("Page885");
		ps.setScene(scene);
		ps.setOnCloseRequest(event->System.out.println("프로그램 종료"));
		ps.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
