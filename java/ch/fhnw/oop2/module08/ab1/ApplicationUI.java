package ch.fhnw.oop2.module08.ab1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ApplicationUI extends VBox{
	
	Button button;

	public ApplicationUI(PresentationModel pm) {
		initalizeControls(pm);
		layoutControls();
	}
	
	private void initalizeControls(PresentationModel pm) {
		button = new Button().textProperty().bind(pm.getButton());
	}
	
	public void layoutControls() {
		VBox rootPane = new VBox();
		
		rootPane.setPadding(new Insets(10, 10, 10, 10));
		rootPane.getChildren().add(button);
		
		this.getChildren().add(rootPane);
	}

}