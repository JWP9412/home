package section17_3_1_layout;


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain1731 extends Application{
	@Override
	public void start(Stage ps) throws Exception{
		HBox hbox = new HBox();						//HBox 컨테이너 생성
		hbox.setPadding(new Insets(10));			//안쪽 여백 설정
		hbox.setSpacing(10);						//컨트롤 간의 수평 간격 설정
		
		TextField tf = new TextField();				//TextField 컨트롤 생성
		tf.setPrefWidth(200);						//TextField의 폭 설정
		
		Button btn = new Button();					//Button 컨트롤 생성
		btn.setText("확-인");						//Button 글자 설정
		
		ObservableList list = hbox.getChildren();	//HBox의 ObservableList 얻기
		list.add(tf);								//TextField 컨트롤 배치
		list.add(btn);								//Button의 컨트롤 배치
		
		Scene scene = new Scene(hbox);				//장면 생성
		
		ps.setTitle("뿅");							//윈도우 창 제목 설정
		ps.setScene(scene);							//윈도우 창에 장면 설정
		ps.show();									//윈도우 창 보여주기
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
