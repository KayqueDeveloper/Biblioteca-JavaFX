package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{
	
	private int contador = 0;
	
	private void mudarLabel(Label label) {
		label.setText(Integer.toString(contador));

		label.getStyleClass().remove("vermelho");
		label.getStyleClass().remove("verde");
		
		if(contador > 0) {
			label.getStyleClass().add("verde");
		}else if( contador < 0) {
			label.getStyleClass().add("vermelho");
		}
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		Button botaoIncremento = new Button("+");
		botaoIncremento.getStyleClass().add("botoes");
		botaoIncremento.setOnAction(e -> {
			contador++; 
			mudarLabel(labelNumero);
		});
		
		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().add("botoes");
		botaoDecremento.setOnAction(e -> {
			contador--;
			mudarLabel(labelNumero);
		});
		
		HBox boxBotao = new HBox();
		boxBotao.setAlignment(Pos.CENTER);
		boxBotao.setSpacing(10);
		boxBotao.getChildren().add(botaoDecremento);
		boxBotao.getChildren().add(botaoIncremento);
		
		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(10);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotao);
		
		String caminhoDoCss = getClass().getResource("/basico/Contador.css").toExternalForm();
		
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoDoCss);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css?family=Oswald");
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
		
		
	}
}
