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
						"������S6", "������S7", 
						"������S8", "������S9", 
						"������S10", "������S20", "������S21"
						));

		listView.getSelectionModel().selectedIndexProperty().addListener(
				new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable,
					Number oldValue, Number newValue) {
				tableView.getSelectionModel().select(newValue.intValue()); // ����� �ε����� �� ����
				tableView.scrollTo(newValue.intValue()); // ����� �ε��� ��ġ�� ��ũ�� ��Ŵ
			}
		}); 
				ObservableList phoneList = FXCollections.observableArrayList(
						new Phone("������S6", "phone06.png"),
						new Phone("������S7", "phone07.png"), 
						new Phone("������S8", "phone08.png"),
						new Phone("������S9", "phone09.png"), 
						new Phone("������S10", "phone10.png"),
						new Phone("������S20", "phone20.png"), 
						new Phone("������S21", "phone21.png")
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
		System.out.println("ListView ����Ʈ�� : " + item);

		Phone phone = tableView.getSelectionModel().getSelectedItem();
		System.out.println("TableView ����Ʈ�� : " + phone.getSmartPhone());
		System.out.println("TableView �̹��� : " + phone.getImage());
	}

	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}
