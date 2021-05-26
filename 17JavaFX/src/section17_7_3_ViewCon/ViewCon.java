package section17_7_3_ViewCon;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ViewCon implements Initializable {
	@FXML
	private ListView<String> listView;
	@FXML
	private TableView<Phone> tableView;
	@FXML
	private ImageView imageView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listView.setItems(
				FXCollections.observableArrayList(
						"°¶·°½ÃS6", "°¶·°½ÃS7", 
						"°¶·°½ÃS8", "°¶·°½ÃS9", 
						"°¶·°½ÃS10", "°¶·°½ÃS20", "°¶·°½ÃS21"
						));

		listView.getSelectionModel().selectedIndexProperty().addListener(
				new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable,
					Number oldValue, Number newValue) {
				tableView.getSelectionModel().select(newValue.intValue()); // º¯°æµÈ ÀÎµ¦½ºÀÇ Çà ¼±ÅÃ
				tableView.scrollTo(newValue.intValue()); // º¯°æµÈ ÀÎµ¦½º À§Ä¡·Î ½ºÅ©·Ñ ½ÃÅ´
			}
		}); 
				ObservableList phoneList = FXCollections.observableArrayList(
						new Phone("°¶·°½ÃS6", "phone06.png"),
						new Phone("°¶·°½ÃS7", "phone07.png"), 
						new Phone("°¶·°½ÃS8", "phone08.png"),
						new Phone("°¶·°½ÃS9", "phone09.png"), 
						new Phone("°¶·°½ÃS10", "phone10.png"),
						new Phone("°¶·°½ÃS20", "phone20.png"), 
						new Phone("°¶·°½ÃS21", "phone21.png")
						);

				TableColumn tcSmartPhone = tableView.getColumns().get(0);
				tcSmartPhone.setCellFactory(new PropertyValueFactory("smartPhone"));
				tcSmartPhone.setStyle("-fx-alignment: CENTER;");

				TableColumn tcSmartImage = tableView.getColumns().get(1);
				tcSmartPhone.setCellFactory(new PropertyValueFactory("image"));
				tcSmartPhone.setStyle("-fx-alignment: CENTER;");

				tableView.setItems(phoneList);

				tableView.getSelectionModel().selectedItemProperty().addListener(
						new ChangeListener<Phone>() {

					@Override
					public void changed(ObservableValue<? extends Phone> observable,
							Phone oldValue, Phone newValue) {
						if (newValue!=null) {
							imageView.setImage(
									new Image(
										getClass().getResource("images/" + newValue.getImage()).toString()));
						}
					}
				}
			);
		}
	

	public void handleBtnOkAction(ActionEvent e) {
		String item = listView.getSelectionModel().getSelectedItem();
		System.out.println("ListView ½º¸¶Æ®Æù : " + item);

		Phone phone = tableView.getSelectionModel().getSelectedItem();
		System.out.println("TableView ½º¸¶Æ®Æù : " + phone.getSmartPhone());
		System.out.println("TableView ÀÌ¹ÌÁö : " + phone.getImage());
	}

	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}
