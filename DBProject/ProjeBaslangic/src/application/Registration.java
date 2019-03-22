package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Registration {
	@FXML
	private TextField name;
	@FXML
	private TextField surname;
	@FXML
	private TextField mail;
	@FXML
	private TextField username;
	@FXML
	private TextField password;
	
	public void completed(ActionEvent event) throws Exception {
		/*burda sqle ekleme kýsýmlarý olmalý.butona basýnca tamamlama iþlemi olacak çünkü **/
		Stage primaryStage = new Stage();
		
		Parent root = FXMLLoader.load(getClass().getResource("/application/Registration2.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
