package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;

public class PresentationModel {
	public SimpleStringProperty button;
	public SimpleStringProperty name;
	
	public void TextProperty() {
		button.setValue("Test1");
		title.setValue("Test2");
	}

	public ObservableValue getButton() {
		return button;
	}

	public String getTitle() {
		return name.getValue();
	}
}