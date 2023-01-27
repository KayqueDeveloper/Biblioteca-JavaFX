package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Caixa extends HBox {

//  dentro do start
	
//	temp.getChildren().add(new Caixa().comTexto("1"));
//	temp.getChildren().add(new Caixa().comTexto("2"));
//	temp.getChildren().add(new Caixa().comTexto("3"));
//	temp.getChildren().add(new Caixa().comTexto("4"));
//	temp.getChildren().add(new Caixa().comTexto("5"));
//	temp.getChildren().add(new Caixa().comTexto("6"));
	
	
	private static int i = 0;

	private String[] cores = {
		"#c33c5e", "39aac6", "28d79a", "fb750e", "6657a8", "f9060e"
	};
	
	public Caixa() {
		this(100, 100);
	}
	
	public Caixa(int largura, int altura) {
		setAlignment(Pos.CENTER);
		
		setMinHeight(altura);
		setMinWidth(largura);
		
		BackgroundFill fill = new BackgroundFill(Color.web(cores[i]), CornerRadii.EMPTY, Insets.EMPTY);
		setBackground(new Background(fill));
		
		i++;
		if(i == 6) i = 0;
	}
	
	public Caixa comTexto(String texto) {
		Label label = new Label(texto);
		label.setFont(new Font(26));
		
		getChildren().add(label);
		return this;
	}
}
