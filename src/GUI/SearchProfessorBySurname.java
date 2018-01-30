package GUI;

import application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Professor;

public class SearchProfessorBySurname extends Stage {
	public Professor foundProf;
	{
		this.setTitle("Search Professors by Surname");
		VBox vb = new VBox();
		vb.setSpacing(15);
		vb.setPadding(new Insets(15,45,45,45));
		
		TextField txt1 = new TextField("Surname...");
		vb.getChildren().add(txt1);
		
		TextArea area = new TextArea();
		vb.getChildren().add(area);
		
		Button srch = new Button("Search");
		srch.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent arg0) {
				for (Professor professor : Application.getProfessors()) {
					if (professor.getLastName().toLowerCase().contains(txt1.getText().toLowerCase())){
						foundProf = professor;
						area.setText(foundProf.toString());
					}
					
				}
					}
		});
		vb.getChildren().add(srch);
		
		Scene scene = new Scene(vb);
   	 	this.setScene(scene);
   	 	this.showAndWait();
	}
}
