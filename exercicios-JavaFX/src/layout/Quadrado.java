package layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle {

//  dentro do start	
	
//	temp.getChildren().add(new Quadrado());
//	temp.getChildren().add(new Quadrado());
//	temp.getChildren().add(new Quadrado());
//	temp.getChildren().add(new Quadrado());
//	temp.getChildren().add(new Quadrado());
//	temp.getChildren().add(new Quadrado());
	
	private static int i = 0;

	private String[] cores = {
		"#c33c5e", "39aac6", "28d79a", "fb750e", "6657a8", "f9060e"
	};
	
	public Quadrado() {
		this(100);
	}
	
	public Quadrado(int tam) {
		
		setHeight(tam);
		setWidth(tam);
		
		setFill(Color.web(cores[i]));
		
		i++;
		if(i == 6) i = 0;
	}
	
}

