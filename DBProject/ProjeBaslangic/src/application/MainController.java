package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
	
	public void customer(ActionEvent event)throws Exception{
		Stage primaryStage = new Stage();
		
		Parent root = FXMLLoader.load(getClass().getResource("/application/Customer.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public void worker(ActionEvent event)throws Exception{
		Stage primaryStage = new Stage();
		
		Parent root = FXMLLoader.load(getClass().getResource("/application/Worker.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public void employee(ActionEvent event)throws Exception{
		Stage primaryStage = new Stage();
		
		Parent root = FXMLLoader.load(getClass().getResource("/application/Employee.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
