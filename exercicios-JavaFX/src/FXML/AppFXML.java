package FXML;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		String arquicoCSS = getClass().getResource("/FXML/Login.css").toExternalForm();
		URL arquivoFXML = getClass().getResource("/FXML/Login.fxml");
		GridPane raiz = FXMLLoader.load(arquivoFXML);
		
		Scene cena = new Scene(raiz, 350, 350);
		cena.getStylesheets().add(arquicoCSS);
		
		primaryStage.setResizable(false);
		primaryStage.setScene(cena);
		primaryStage.setTitle("Tela de Login");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}

}
