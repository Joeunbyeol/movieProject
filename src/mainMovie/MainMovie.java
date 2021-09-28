package mainMovie;


import java.io.IOException;

import db.dbService;

import dto.MovieDTO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMovie {
	dbService db = new dbService();
	MovieDTO dto = db.selectSQL(null);

	public void start() {
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("mainMovie.fxml"));
		Parent root=null;
		try {
			root = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		MainController ctl = loader.getController();
		ctl.setRoot(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
			
	public static void main(String[] args) {
	
	}
}
