package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Customer {

	@FXML
	private TextField txtUserName;
	
	@FXML
	private TextField txtPassword;
	
	public void Login(ActionEvent event)throws Exception{
		if(txtUserName.getText().equals("user")&& txtPassword.getText().equals("pass")){
			Stage primaryStage = new Stage();
			
			Parent root = FXMLLoader.load(getClass().getResource("/application/Customer2.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		else{
			Stage primaryStage = new Stage();
			
			Parent root = FXMLLoader.load(getClass().getResource("/application/Warning.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	}
	public void Registration(ActionEvent event)throws Exception{
		Stage primaryStage = new Stage();
		
		Parent root = FXMLLoader.load(getClass().getResource("/application/Registration.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
