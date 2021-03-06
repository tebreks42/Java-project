package GUI;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Student;
import javafx.scene.control.Label;

public class StudentMenu extends Stage {
	
	{
	
	    	this.setTitle("Student Menu");
	    	Label lbl1 = new Label("You have logged in as: " + Student.getLoggedIn().getFirstName() +" "+  Student.getLoggedIn().getLastName());
	    	
	    	Button btn1 = new Button();
	    	btn1.setText("1 - Apply for a Test");
	    	btn1.setOnAction(new EventHandler<ActionEvent>(){
	    		@Override
	    		public void handle(ActionEvent event){
	    		new ApplyForTest();
	    		}});
	    	
	    	Button btn2 = new Button();
	    	btn2.setText("2 - View Grades for tests");
	    	btn2.setOnAction(new EventHandler<ActionEvent>(){
	    		@Override
	    		public void handle(ActionEvent event){
	    		new DisplayGrades();
	    		}});
	    	
	    	Button btn3 = new Button();
	    	btn3.setText("3 - View applied tests");
	    	btn3.setOnAction(new EventHandler<ActionEvent>(){
	    		@Override
	    		public void handle(ActionEvent event){
	    			new ViewAppliedTests();
	    		}});
	    	
	    	Button btn4 = new Button();
	    	btn4.setText("4 - Cancel a test");
	    	btn4.setOnAction(new EventHandler<ActionEvent>(){
	    		@Override
	    		public void handle(ActionEvent event){
	    		
					new RemoveTests();
	    		}
	    		
	    	});
	    	
	    	Button btn5 = new Button();
	    	btn5.setText("5 - Exit the program");
	    	btn5.setOnAction(new EventHandler<ActionEvent>(){
	    		@Override
	    		public void handle(ActionEvent event){

	    			  Alert alert = new Alert(AlertType.INFORMATION);
	    			  	alert.setTitle("University TITS");
	    		    	alert.setHeaderText("You have exited the application");
	    		    	alert.setContentText("Thank you for using the university service");

	    		    	alert.showAndWait();
	    		}
	    		
	    	});
	    	VBox root = new VBox();
			root.setSpacing(15);
			root.setPadding(new Insets(15,45,45,45));
	    	root.getChildren().addAll(lbl1,btn1,btn2,btn3,btn4,btn5);
	    	this.setScene(new Scene(root));
	    	this.show();
	    }
}
