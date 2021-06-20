package application;

import java.awt.Color;

import javafx.fxml.FXML;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;

public class BoxesHandler {
 @FXML VBox vbox1;
 
 public void setColor() {
	 Color color = new Color(255,0,0);
	 
	 vbox1.setBackground(color);
 }
 
}
