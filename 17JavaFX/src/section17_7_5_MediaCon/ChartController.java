package section17_7_5_MediaCon;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class ChartController implements Initializable {
	@FXML
	private PieChart pieC;
	@FXML
	private BarChart barC;
	@FXML
	private AreaChart areaC;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		pieC.setData(FXCollections.observableArrayList(
				new PieChart.Data("AWT", 10), 
				new PieChart.Data("Swing", 30),
				new PieChart.Data("SWT", 25), 
				new PieChart.Data("JavaFX", 35)
		));
		
		XYChart.Series series1 = new XYChart.Series();
		series1.setName("man");
		series1.setData(FXCollections.observableArrayList(
				new XYChart.Data("2021",70),
				new XYChart.Data("2022",60),
				new XYChart.Data("2023",50),
				new XYChart.Data("2024",40),
				new XYChart.Data("2025",30)
				));
		
		XYChart.Series series2 = new XYChart.Series();
		series2.setName("woman");
		series2.setData(FXCollections.observableArrayList(
				new XYChart.Data("2021",40),
				new XYChart.Data("2022",50),
				new XYChart.Data("2023",60),
				new XYChart.Data("2024",70),
				new XYChart.Data("2026",40)
				));
		
		barC.getData().addAll(series1,series2);
		
		XYChart.Series series3 = new XYChart.Series();
		series3.setName("평균온도");
		series3.setData(FXCollections.observableArrayList(
				new XYChart.Data("2021",12),
				new XYChart.Data("2022",23),
				new XYChart.Data("2023",34),
				new XYChart.Data("2024",45),
				new XYChart.Data("2026",56)
				));
		
		XYChart.Series series4 = new XYChart.Series();
		series4.setName("온도");
		series4.setData(FXCollections.observableArrayList(
				new XYChart.Data("2021",98),
				new XYChart.Data("2022",78),
				new XYChart.Data("2023",65),
				new XYChart.Data("2024",45),
				new XYChart.Data("2026",32)
				));
		areaC.getData().addAll(series3,series4);
	}
	
}
